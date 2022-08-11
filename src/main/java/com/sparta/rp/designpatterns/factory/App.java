package com.sparta.rp.designpatterns.factory;

public class App {
    public static void main(String[] args) {
        Speakable dog = AnimalFactory.getAnimal("dog");
        System.out.println(dog.getClass());
        dog.speak();
    }
}
