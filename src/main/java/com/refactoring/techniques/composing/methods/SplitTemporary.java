package com.refactoring.techniques.composing.methods;

public class SplitTemporary {

    /**
     * Example before refactore.
     */
    class CarRepair {

        private int enginePrice;
        private int carBodyPrice;

        public CarRepair(int enginePrice, int carBodyPrice) {
            this.enginePrice = enginePrice;
            this.carBodyPrice = carBodyPrice;
        }

        public void printRepairPrice(){
            double temp = enginePrice + 10;
            System.out.println("Engine Price: " + temp);

            temp = carBodyPrice + 5;
            System.out.println("Car Body Price : " + temp);
        }

    }

    /**
     * Example after applying Split Temporary Variable technique
     */
    class RefactoredCarRepair {

        private int enginePrice;
        private int carBodyPrice;

        public RefactoredCarRepair(int enginePrice, int carBodyPrice) {
            this.enginePrice = enginePrice;
            this.carBodyPrice = carBodyPrice;
        }

        public void printRepairPrice(){
            final double totalEnginePrice = enginePrice + 10;
            System.out.println("Engine Price: " + totalEnginePrice);

            final double totalCartBodyPrice = carBodyPrice + 5;
            System.out.println("Car Body Price : " + totalCartBodyPrice);
        }

    }
}
