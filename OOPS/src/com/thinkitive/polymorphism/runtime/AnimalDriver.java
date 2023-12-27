package com.thinkitive.polymorphism.runtime;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal = new Lion();
        //RunTime PolyMorphism
        animal.makeSound();
    }
}
