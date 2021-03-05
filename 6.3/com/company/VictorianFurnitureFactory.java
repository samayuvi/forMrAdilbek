package com.company;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
