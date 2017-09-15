package com.hahnekamp.legacyapp;

public class Greeter {
    private GreetMessage greetMessage;

    public Greeter(GreetMessage greetMessage) {
        this.greetMessage = greetMessage;
    }

    public void greet() {
        System.out.println(this.greetMessage.getMessage());
    }
}
