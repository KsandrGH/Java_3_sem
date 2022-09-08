package com.company;

public class TestShape {

    public static void main(String[] args) {
        Shape b1 = new Shape("Круг", "Жёлтый");
        Shape b2 = new Shape("Шар", "Оранжевый");
        Shape b3 = new Shape("Треугольник", "Зелёный");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setColor("Синий");
        System.out.println("Новый цвет " + b3.getName() + "а теперь " + b3.getColor());

    }
}