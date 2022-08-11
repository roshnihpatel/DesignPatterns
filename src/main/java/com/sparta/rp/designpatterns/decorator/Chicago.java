package com.sparta.rp.designpatterns.decorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago pizza";
    }

    @Override
    public double getCost() {
        return 15.99;
    }
}
