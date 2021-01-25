package com.zsquared.phonecontact;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("321 123 4567");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter Action: (6 to show actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting Down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                default:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact(){
        System.out.println("Enter New Contact.");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact created : Name = "+name+ " Phone = "+phone);
        }else{
            System.out.println("Unable to create contact "+name+ " already exists.");
        }

    }

    private static void updateContact(){
        System.out.println("Enter Existing Contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated:");
        }else {
            System.out.println("Error updating Contact");
        }


    }

    private static void removeContact() {
        System.out.println("Enter Existing Contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting");
        }

    }

    private static void queryContact() {
        System.out.println("Enter Existing Contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name : " +existingContact.getName()+ " and Phone : "+existingContact.getPhoneNumber());

    }


    private static void startPhone(){
        System.out.println("Starting phone.....");
    }

    private static void printActions(){
        System.out.println("\nAvailable Actions:");
        System.out.println( "0 : Shutdown\n" +
                            "1 : print contacts\n" +
                            "2 : Add Contact\n" +
                            "3 : Update existing Contact\n" +
                            "4 : Remove existing Contact\n" +
                            "5 : Query existing Contact\n" +
                            "6 : Print list of available options") ;
        System.out.println("Choose Action:");
    }
}
