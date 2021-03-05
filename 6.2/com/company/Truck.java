package com.company;

public class Truck extends Logistics{
    @Override
    Transport createTransport() {
        return new RoadLogistics();
    }
}
