package com.company;

public class DogTest {

    public static void main(String[] args) {
        Dog d1 = new Dog("�����", 6);
        Dog d2 = new Dog("������", 3);
        Dog d3 = new Dog("�����", 5);
        Dog d4 = new Dog("���", 2);
        Dog d5 = new Dog("�����", 4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        d1.toHumanAge();
        d2.toHumanAge();
        d3.toHumanAge();
        d4.toHumanAge();
        d5.toHumanAge();
    }
}
