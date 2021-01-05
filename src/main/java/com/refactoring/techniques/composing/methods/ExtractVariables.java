package com.refactoring.techniques.composing.methods;

public class ExtractVariables {

    /**
     * Example before refactore.
     */
    class CarSpecification {

        private double liter;
        private int torque;
        private double price;

        public CarSpecification(double liter, int torque, double price) {
            this.liter = liter;
            this.torque = torque;
            this.price = price;
        }

        public void printCarCategory(){
            if ((this.liter > 5) &&
                (this.torque > 500) &&
                 price > 100000) {
                System.out.println("Sport Car.");
            } else {
                System.out.println("Common Car.");
            }
        }

    }

    /**
     * Example after applying Extract Variables technique
     */
    class RefactoredCarSpecification {

        private double liter;
        private int torque;
        private double price;

        public RefactoredCarSpecification(double liter, int torque, double price) {
            this.liter = liter;
            this.torque = torque;
            this.price = price;
        }

        public void printCarCategory(){
            final boolean hasMinimumLiter = this.liter > 5;
            final boolean hasMinimumTorque = this.torque > 500;
            final boolean hasMinimumPrice = price > 100000;

            if (hasMinimumLiter && hasMinimumTorque & hasMinimumPrice) {
                System.out.println("Sport Car.");
            } else {
                System.out.println("Common Car.");
            }
        }
        
    }
}
