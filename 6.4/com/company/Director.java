package com.company;

public class Director {
    public Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(String type){
        builder.reset();
        if (type != "simple") {
            builder.setWalls();

        }
        builder.setFloor();
        builder.setRoof();
    }
}
