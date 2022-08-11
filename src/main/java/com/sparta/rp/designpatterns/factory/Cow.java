package com.sparta.rp.designpatterns.factory;

public class Cow implements Speakable{
    @Override
    public void speak() {
        System.out.println("mooo");
    }
}
