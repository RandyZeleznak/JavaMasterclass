package com.zsquared.todolist;

import com.zsquared.todolist.datamodel.ToDoData;
import com.zsquared.todolist.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<ToDoItem> toDoItems;
    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadLineLabel;

    @FXML
    private BorderPane mainBorderPane;

    public void initialize(){

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {
                if(newValue != null){
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadLineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        toDoListView.setItems(ToDoData.getInstance().getToDoItems());
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();

        toDoListView.setCellFactory(new Callback<ListView<ToDoItem>, ListCell<ToDoItem>>() {
            @Override
            public ListCell<ToDoItem> call(ListView<ToDoItem> param) {
                ListCell<ToDoData> cell = new ListCell<ToDoData>(){
                    @Override
                    protected void updateItem(ToDoItem item, boolean empty) {
                        super.updateItem(item,empty);
                    }
                };
                return cell;
            }
        });

    }


    public void showNewItemDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New ToDo Item");
        dialog.setHeaderText("Use this to create a new ToDo Item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("toDoItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e){
            System.out.println("Couldn't load dialog");
            e.printStackTrace();
            return;
        }
        
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            DialogController controller = fxmlLoader.getController();
            ToDoItem newItem = controller.processResults();
    //        toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
            toDoListView.getSelectionModel().select(newItem);
        /*    System.out.println("Pressed OK");
        } else {
            System.out.println("presed Cancel");*/
        }
    }

    @FXML
    public void handleClickListView(){
        ToDoItem item =  toDoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadline().toString());
        //System.out.println("Selected Item : " +item);


    }
    
}
