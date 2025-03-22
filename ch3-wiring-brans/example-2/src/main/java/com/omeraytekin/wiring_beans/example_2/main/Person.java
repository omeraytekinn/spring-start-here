package com.omeraytekin.wiring_beans.example_2.main;

public class Person {
    private String name;
    private Parrot parrot;

    public Person() {
        System.out.println("Person instance created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
