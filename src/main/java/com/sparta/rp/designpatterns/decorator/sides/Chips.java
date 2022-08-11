package com.sparta.rp.designpatterns.decorator.sides;

import com.sparta.rp.designpatterns.decorator.Pizza;

public class Chips extends Sides{
    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips" ;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
