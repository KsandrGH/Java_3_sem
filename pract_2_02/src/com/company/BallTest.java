package com.company;

public class BallTest {

    public static void main(String[] args) {
        Ball b1 = new Ball("ћ€ч_1", "—иний", 5.5);
        Ball b2 = new Ball("ћ€ч_2", "–озовый", 3.7);
        Ball b3 = new Ball("ћ€ч_3", "«елЄный", 2.5);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setColor("„Єрно-белый");
        System.out.println("Ќовый цвет " + b3.getName() + " теперь " + b3.getColor());
        System.out.println("ќбъЄм м€ча " + b3.getName() + " равен " + b3.getSizeOfABall());

    }
}