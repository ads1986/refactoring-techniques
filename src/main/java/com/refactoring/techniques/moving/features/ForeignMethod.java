package com.refactoring.techniques.moving.features;

import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.now;

public class ForeignMethod {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class PaymentOrder {

            public void process(double value, int orderNumber){
                LocalDate availableDay = now().plusDays(1);
                // Some code to implement process flow here
            }

        }

    }

    /**
     * Example after applying Foreign Method technique
     */
    class AfterRefactore{

        class PaymentOrder {

            public void process(double value, int orderNumber){
                LocalDate availableDay = nextAvailableDate(now());
                // Some code to implement process flow here
            }

            public LocalDate nextAvailableDate(LocalDate now){
                return now.plusDays(1);
            }

        }

    }

}
