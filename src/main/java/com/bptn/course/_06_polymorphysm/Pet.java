package com.bptn.course._06_polymorphysm;

class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void speak() {
        System.out.println("Animal sound");
    }
}