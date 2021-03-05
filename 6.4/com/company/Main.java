package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Director director=new Director(new HouseBuilder());
        director.make("simple");
        System.out.println("Building is completed successful");


    }
}
