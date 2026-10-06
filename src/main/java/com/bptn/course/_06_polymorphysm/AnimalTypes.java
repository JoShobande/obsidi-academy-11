package com.bptn.course._06_polymorphysm;

public class AnimalTypes {

	public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName());
        System.out.println(dog.getType());
        dog.speak();

        Cat cat = new Cat("Whiskers");
        System.out.println(cat.getName());
        System.out.println(cat.getType());
        cat.speak();
    }
}
