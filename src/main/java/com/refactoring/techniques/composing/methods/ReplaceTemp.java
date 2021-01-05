package com.refactoring.techniques.composing.methods;

public class ReplaceTemp {

    /**
     * Example before refactore.
     */
    class CarRetail {

        private double price;
        private double discount;

        public CarRetail(double price, double discount) {
            this.price = price;
            this.discount = discount;
        }

        public double getLiquidCarPrice(){
            double salePrice = this.price - ((this.price * this.discount) / 100);
            if (salePrice > 10.000)
                return salePrice - 100;

            return salePrice;
        }

    }

    /**
     * Example after applying Extract Method technique
     */
    class RefactoredCarRetail {

        private double price;
        private double discount;

        public RefactoredCarRetail(double price, double discount) {
            this.price = price;
            this.discount = discount;
        }

        public double getLiquidCarPrice(){
            if (getSalePrice() > 10.000)
                return getSalePrice() - 100;

            return getSalePrice();
        }

        public double getSalePrice(){
            return this.price - ((this.price * this.discount) / 100);
        }

    }
}
