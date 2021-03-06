package com.refactoring.techniques.composing.methods;

public class InlineTemp {

    /**
     * Example before refactore.
     */
    class CarRent {

        private double dailyPrice;

        public CarRent(int dailyPrice) {
            this.dailyPrice = dailyPrice;
        }

        public boolean hasMinimumValue(){
            double liquidPrice = liquidPrice();
            return liquidPrice > 10000;
        }

        public double liquidPrice(){
            return dailyPrice - 100;
        }

    }

    /**
     * Example after applying Inline Temp technique
     * Tip : Use only if the variable is not caching
     * a value to improve the performance, and space
     * usage.
     */
    class RefactoredCarRent {

        private double dailyPrice;

        public RefactoredCarRent(int dailyPrice) {
            this.dailyPrice = dailyPrice;
        }

        public boolean hasMinimumValue(){
            return liquidPrice() > 10000;
        }

        public double liquidPrice(){
            return dailyPrice - 100;
        }

    }
}
