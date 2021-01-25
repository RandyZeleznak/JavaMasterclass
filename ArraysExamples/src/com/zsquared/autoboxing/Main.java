package com.zsquared.autoboxing;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase");
        bank.addBranch("Pilsen");

        bank.addCustomer("Pilsen","Bob",75.75);
        bank.addCustomer("Pilsen","Joe",155.00);
        bank.addCustomer("Pilsen","Stella",25.00);

        bank.addBranch("Chicago");
        bank.addCustomer("Chicago", "Ron",85.00);

        bank.addCustomerTransaction("Pilsen","Bob",50.00);
        bank.addCustomerTransaction("Pilsen","Joe",15.00);
        bank.addCustomerTransaction("Pilsen","Joe",65.00);
        bank.addCustomerTransaction("Pilsen","Stella",25.00);

        bank.listCustomers("Pilsen", true);
        bank.addCustomerTransaction("Chicago", "Ron",85.00);
        bank.listCustomers("Chicago", true);
    }
}
