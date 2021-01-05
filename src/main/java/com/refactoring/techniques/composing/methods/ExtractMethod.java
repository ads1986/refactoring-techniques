package com.refactoring.techniques.composing.methods;

import com.refactoring.techniques.model.Car;

public class ExtractMethod {

    /**
     * Example before refactore.
     */
    class CarService {

        public void printCartDetail(Car car){
            // Financial Detail
            System.out.println("Price: " + car.getPrice());
            System.out.println("Discount : " + car.getDiscount() + "%");

            // Car Description
            System.out.println("Name: " + car.getName());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Year: " + car.getYear());
        }

    }

    /**
     * Example after applying Extract Method technique
     */
    class RefactoredCarService {

        public void printCartDetail(Car car){
            printFinancialDetail(car);
            printCarDescription(car);
        }

        public void printFinancialDetail(Car car){
            // Financial Detail
            System.out.println("Price: " + car.getPrice());
            System.out.println("Discount : " + car.getDiscount() + "%");
        }

        public void printCarDescription(Car car){
            // Car Description
            System.out.println("Name: " + car.getName());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Year: " + car.getYear());
        }

    }
}