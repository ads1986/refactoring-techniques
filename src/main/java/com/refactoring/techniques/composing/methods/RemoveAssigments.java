package com.refactoring.techniques.composing.methods;

public class RemoveAssigments {

    /**
     * Example before refactore.
     */
    class CarRetail {

        public double getLiquidCarPrice(double price){
            if (price > 10.000)
                return price += 10;

            return price;
        }

    }

    /**
     * Example after applying Remove Assignments to Parameters technique
     */
    class RefactoredCarRetail {

        public double getLiquidCarPrice(double price){
            double liquidPrice = price;
            if (liquidPrice > 10.000)
                return liquidPrice += 10;

            return liquidPrice;
        }

    }
}
