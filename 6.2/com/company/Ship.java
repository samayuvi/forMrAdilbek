package com.company;

public class Ship extends Logistics{
    @Override
    Transport createTransport() {
        return new SeaLogistics();
    }
}
