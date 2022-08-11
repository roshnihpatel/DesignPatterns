package com.sparta.rp.designpatterns.factory;

public class Cat implements Speakable{
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
