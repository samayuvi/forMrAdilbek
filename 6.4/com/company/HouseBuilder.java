package com.company;

public class HouseBuilder implements Builder {
    private House house;

    @Override
    public void reset() {
        house=new House();

    }

    @Override
    public void setFloor() {

    }

    @Override
    public void setRoof() {
        System.out.println("Roof of ur house is ... ... ... set");
    }

    @Override
    public String setWalls() {
        return "Setting walls of your house is completed";

    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

}
