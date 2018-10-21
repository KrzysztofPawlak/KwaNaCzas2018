package com.lab5.zad1;

public class Dog extends Animal {

    private Animal friend;

    Dog(String name, Animal friend) {
        super(name);
        this.friend = friend;
    }

    Dog(String name) {
        super(name);
    }

    protected Animal getFriend() {
        return friend;
    }
}
