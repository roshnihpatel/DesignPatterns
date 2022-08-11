package com.sparta.rp.designpatterns.decorator;

public class Italian extends Pizza{

    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 13.99;
    }
}
