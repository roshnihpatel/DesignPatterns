package com.sparta.rp.designpatterns.decorator.sides;

import com.sparta.rp.designpatterns.decorator.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;
    public Sides(Pizza pizza){ //an abzstract class that takes another abstract class as a constructor parameter
        this.pizza = pizza;
    }
    public abstract String getDescription();
}
