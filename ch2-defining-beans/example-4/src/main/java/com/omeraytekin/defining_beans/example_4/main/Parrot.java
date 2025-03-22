package com.omeraytekin.defining_beans.example_4.main;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot instance created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
