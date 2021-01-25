package com.zsquared;

import com.zsquared.hamburger.Hamburger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon" ,7.50, "White");
        super.addHamburgerAddition1("Chips",.75);
        super.addHamburgerAddition2("Drink",1.25);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add extra item");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add extra item");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add extra item");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add extra item");
    }
}
