package com.lab5.zad1;

public class Main {

    public static void main(String[] args) {

        Dog friend = new Dog("Azor");
        BadDog bdFriend = new BadDog("Pimpek", friend);
        Cat cat = new Cat("Kita");

        BadDog bd = new BadDog("Zuzia");
        BadDog bd2 = new BadDog("Locky", bdFriend);
        BadDog bd3 = new BadDog("Felek", friend);

        bd.attack(bd2);
        System.out.println("###");
        bd2.attack(bd3);
        System.out.println("###");
        bd3.attack(bd3);
        System.out.println("###");
        bd2.attack(cat);
        System.out.println("###");
        bd2.attack(bdFriend);
    }
}
