package com.company;

public class Main {

    public static void main(String[] args) {
	Database.getInstance("Johnathon");
	System.out.println(Database.getInstance("Crip Crip").name);
    }
}
