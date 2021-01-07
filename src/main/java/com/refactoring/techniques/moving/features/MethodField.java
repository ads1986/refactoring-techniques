package com.refactoring.techniques.moving.features;

import java.time.LocalDate;
import java.util.List;

public class MethodField {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class PaymentOrder {

            public LocalDate currenteDate = LocalDate.now();

            public void process(double value, int orderNumber){
                // Some code to implement process flow here
                pay(value, orderNumber, currenteDate);
            }

            public void pay(double value, int orderNumber, LocalDate currentDate){
                // Some code to implement payment here
            }

        }

        class PlaceOrder {

            public void createOrder(List<Integer> productIds){
                // Some code to create order here
                addProducts(productIds, new PaymentOrder().currenteDate);
            }

            public void addProducts(List<Integer> productIds, LocalDate localDate){
                // Some code to add products;
            }

            public LocalDate getDueBilletDate(double[] taxes){
                return new PaymentOrder().currenteDate.plusDays(3);
            }

        }

    }

    /**
     * Example after applying Move Field technique
     */
    class AfterRefactore{

        class PaymentOrder {

            public void process(double value, int orderNumber){
                // Some code to implement process flow here
                pay(value, orderNumber, LocalDate.now());
            }

            public void pay(double value, int orderNumber, LocalDate currentDate){
                // Some code to implement payment here
            }

        }

        class PlaceOrder {

            private LocalDate currenteDate = LocalDate.now();

            public void createOrder(List<Integer> productIds){
                // Some code to create order here
                addProducts(productIds, currenteDate);
            }

            public void addProducts(List<Integer> productIds, LocalDate localDate){
                // Some code to add products;
            }

            public LocalDate getDueBilletDate(double[] taxes){
                return currenteDate.plusDays(3);
            }

        }

    }

}
