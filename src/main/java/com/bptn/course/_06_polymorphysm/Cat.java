package com.bptn.course._06_polymorphysm;

class Cat extends Pet {

    public Cat(String name) {
        super(name, "cat");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}