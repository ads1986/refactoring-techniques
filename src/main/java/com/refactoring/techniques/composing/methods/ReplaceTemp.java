package com.refactoring.techniques.composing.methods;

import com.refactoring.techniques.model.Car;

public class ReplaceTemp {

    /**
     * Example before refactore.
     */
    class CarRetailService {

        private double price;
        private double discount;

        public CarRetailService(double price, double discount) {
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
    class RefactoredCarRetailService {

        private double price;
        private double discount;

        public RefactoredCarRetailService(double price, double discount) {
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
