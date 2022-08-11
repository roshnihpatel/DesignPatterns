package com.sparta.rp.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getSingleton();
        SingletonExample s2 = SingletonExample.getSingleton();
        SingletonExample s3 = SingletonExample.getSingleton();
        SingletonExample s4 = SingletonExample.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
