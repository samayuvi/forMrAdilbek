package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new ModernFurnitureFactory().createChair().checkType());
        System.out.println(new VictorianFurnitureFactory().createChair().checkType());



    }
}
