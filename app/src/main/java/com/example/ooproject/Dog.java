package com.example.ooproject;

public class Dog extends Animal{

    public void test(){
        super.sing();
    }

    public void sing(){
        System.out.println("dog class");
    }
}