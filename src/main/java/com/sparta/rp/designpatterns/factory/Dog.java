package com.sparta.rp.designpatterns.factory;

public class Dog  implements Speakable{
    @Override
    public void speak() {
        System.out.println("woof woof");
    }
}
