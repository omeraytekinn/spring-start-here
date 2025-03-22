package com.omeraytekin.wiring_beans.example_4.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name = "Jon";
    private final Parrot parrot;

    public Customer(@Qualifier("customer-parrot") Parrot parrot) {
        this.parrot = parrot;
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
}
