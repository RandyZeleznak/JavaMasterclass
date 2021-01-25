package com.zsquared;

public class CarExample {

    static class Car {
        private boolean engine;
        private  int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public String   startEngine(){
            return "Car - startEngine";
        }

        public String accelarate(){
            return "Car - accelarate";
        }

        public String brake(){
            return "Car - brake";
        }
    }

    static class Mitsubishi extends Car{

        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi - startEngine";
        }

        @Override
        public String accelarate() {
            return "Mitsubishi - accelarate";
        }

        @Override
        public String brake() {
            return "Mitsubishi - brake";
        }
    }


    public static void main(String[] args) {
    Car car = new Car(8, "Base car");
    System.out.println(car.startEngine());
    System.out.println(car.accelarate());
    System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelarate());
        System.out.println(mitsubishi.brake());

        Chevy chevy = new Chevy(6, "Chevy");
        System.out.println(chevy.startEngine());
        System.out.println(chevy.accelarate());
        System.out.println(chevy.brake());

    }
}
