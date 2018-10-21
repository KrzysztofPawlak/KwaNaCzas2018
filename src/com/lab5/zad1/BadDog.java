package com.lab5.zad1;

public class BadDog extends Dog {

    BadDog(String name, Animal friend) {
        super(name, friend);
    }

    BadDog(String name) {
        super(name);
    }

    private void attack(Animal source, Animal target) {
        System.out.println(source.getName() + " attacked " + target.getName());
        response(source, target);
    }

    private void response(Animal source, Animal target) {
        if(target instanceof BadDog) {
            System.out.println(target.getName() + " responsed to: " + source.getName());
        }
    }

    void attack(Animal target) {

        if(target.equals(this)) {
            System.out.println("Can't attack himself");
        } else if (target.equals(getFriend())) {
            System.out.println("Can't attack friend");
        } else {
            attack(this, target);

            if(getFriend() instanceof BadDog) {
                attack(getFriend(), target);
            }
        }
    }
}
