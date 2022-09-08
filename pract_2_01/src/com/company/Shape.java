package com.company;
import java.text.DecimalFormat;
import java.lang.constant.Constable;

public class Shape {
    private String model;
    private String color;

    // Конструктор без параметров.
    public Shape() {
        this.model = "Мяч";
        this.color = "Цвет";
    }

    // Конструктор с параметрами.
    public Shape(String model, String color) {
        this.model = model;
        this.color = color;
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

    public String toString() {
        return this.model + ", Цвет(" + this.color + ")";
    }

}
