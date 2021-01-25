package com.zsquared;

public class Chevy extends CarExample.Car {


        public Chevy(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Chevy - startEngine";
        }

        @Override
        public String accelarate() {
            return "Chevy - accelerate";
        }

        @Override
        public String brake() {
            return "Chevy - brake";
        }




}
