package com.bptn.course._06_polymorphysm;

class Dog extends Pet {

    public Dog(String name) {
        super(name, "dog");
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
