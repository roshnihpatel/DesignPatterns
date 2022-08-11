package com.sparta.rp.designpatterns.decorator;

import com.sparta.rp.designpatterns.decorator.sides.Chips;
import com.sparta.rp.designpatterns.decorator.sides.Salad;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost " + italian.getCost());
        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());
        Chicago chicago = new Chicago();
        Chips chips = new Chips(chicago);
        System.out.println(chicago.getDescription() + "Cost: " + chicago.getCost());
        System.out.println(chips.getDescription() + "Cost: " + chips.getCost());




    }
}
