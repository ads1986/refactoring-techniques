package com.refactoring.techniques.composing.methods;

public class InlineMethod {

    /**
     * Example before refactore.
     */
    class CarRent {

        private double dailyPrice;

        public CarRent(int dailyPrice) {
            this.dailyPrice = dailyPrice;
        }

        public double calculatePrice(){
            return hasTax() ? (dailyPrice - 10) : dailyPrice;
        }

        public boolean hasTax(){
            return dailyPrice > 100;
        }

    }

    /**
     * Example after applying Inline Method technique
     */
    class RefactoredCarRent {

        private double dailyPrice;

        public RefactoredCarRent(int dailyPrice) {
            this.dailyPrice = dailyPrice;
        }

        public double calculatePrice(){
            return dailyPrice > 100 ? (dailyPrice - 10) : dailyPrice;
        }

    }
}
