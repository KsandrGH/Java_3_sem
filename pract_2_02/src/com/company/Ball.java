package com.company;
import java.text.DecimalFormat;
import java.lang.constant.Constable;

public class Ball {
    private String model;
    private String color;
    private double radius;

    // Конструктор без параметров.
    public Ball() {
        this.model = "Мяч";
        this.color = "Цвет";
        this.radius = 5;
    }

    // Конструктор с параметрами.
    public Ball(String model, String color, double radius) {
        this.model = model;
        this.color = color;
        this.radius = radius;
    }

    // Свойство - изменение модели.
    public void setName(String temp) {
        this.model = temp;
    }

    // Свойство - получение модели.
    public String getName() {
        return this.model;
    }

    // Свойство - установка цвета.
    public void setColor(String temp) {
        this.color = temp;
    }

    // Свойство - получение цвета.
    public String getColor() {
        return this.color;
    }

    // Свойство - установка размера.
    public void setRadius(double temp) {
        this.radius = temp;
    }

    // Свойство - получение размера.
    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return this.model + ", Цвет(" + this.color + "), Радиус = " + this.radius;
    }

    // Получение объема мяча.
    public Constable getSizeOfABall() {
        DecimalFormat dF = new DecimalFormat( "#.###" );
        final double pi = 3.14;
        double size = 4.0 / 3.0 * Math.pow(radius, 3) * pi;
        return dF.format(size);
    }
}
