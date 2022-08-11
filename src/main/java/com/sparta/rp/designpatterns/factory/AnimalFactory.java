package com.sparta.rp.designpatterns.factory;

public class AnimalFactory {
    public static Speakable getAnimal(String animal){
        return switch (animal) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "cow" -> new Cow();
            default -> null;

        };

    }
}
