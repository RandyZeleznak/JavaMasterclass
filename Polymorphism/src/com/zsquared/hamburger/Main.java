package com.zsquared.hamburger;


import com.zsquared.DeluxeBurger;

public class Main {
    public static void main(String[] args) {


    Hamburger hamburger = new Hamburger("Basic Burger", "GroundBeef",2.5,"White");
    double price = hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("Tomato", .15);
    hamburger.addHamburgerAddition2("Cheese",.50);
    System.out.println("Total price = "+hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.50);
    hamburger.addHamburgerAddition1("Tomato", .15);
    healthyBurger.addHealthyAddition1("Egg",1.50);
    healthyBurger.itemizeHamburger();
    System.out.println("Total Helathy Burger price = "+healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Cheese", .50);
        deluxeBurger.itemizeHamburger();

        System.out.println("Total Deluxe Burger price = "+deluxeBurger.itemizeHamburger());


    }

}
