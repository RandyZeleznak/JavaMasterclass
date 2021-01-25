package com.zsquared.hamburger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String additionalItem1Name;
    private double additionalItem1Price;
    private String additionalItem2Name;
    private double additionalItem2Price;
    private String additionalItem3Name;
    private double additionalItem3Price;
    private String additionalItem4Name;
    private double additionalItem4Price;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addHamburgerAddition1(String name, double price){
            this.additionalItem1Name = name;
            this.additionalItem1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.additionalItem2Name = name;
        this.additionalItem2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.additionalItem3Name = name;
        this.additionalItem3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.additionalItem4Name = name;
        this.additionalItem4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println("itemizeHamburger"+this.additionalItem1Name+ "price" + this.additionalItem1Price);
        System.out.println(this.name+ " Hamburger on a " +this.breadType+ " bun, price is "+this.price );
        if(this.additionalItem1Name != null){
            hamburgerPrice += this.additionalItem1Price;
            System.out.println("Additional Item:"+this.additionalItem1Name+ " at price of "+this.additionalItem1Price);
        }
        if(this.additionalItem2Name != null){
            hamburgerPrice += this.additionalItem2Price;
            System.out.println("Additional Item:"+this.additionalItem2Name+ " at price of "+this.additionalItem2Price);
        }
        if(this.additionalItem3Name != null){
            hamburgerPrice += this.additionalItem3Price;
            System.out.println("Additional Item:"+this.additionalItem3Name+ " at price of "+this.additionalItem3Price);
        }
        if(this.additionalItem4Name != null){
            hamburgerPrice += this.additionalItem4Price;
            System.out.println("Additional Item:"+this.additionalItem4Name+ " at price of "+this.additionalItem4Price);
        }

        System.out.println("Hamburg -> "+ hamburgerPrice);
        return hamburgerPrice;
    }



}













