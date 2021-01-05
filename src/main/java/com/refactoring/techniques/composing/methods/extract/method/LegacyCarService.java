package com.refactoring.techniques.composing.methods.extract.method;

public class LegacyCarService {

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
