package com.company;
import java.text.DecimalFormat;
import java.lang.constant.Constable;

public class Ball {
    private String model;
    private String color;
    private double radius;

    // ����������� ��� ����������.
    public Ball() {
        this.model = "���";
        this.color = "����";
        this.radius = 5;
    }

    // ����������� � �����������.
    public Ball(String model, String color, double radius) {
        this.model = model;
        this.color = color;
        this.radius = radius;
    }

    // �������� - ��������� ������.
    public void setName(String temp) {
        this.model = temp;
    }

    // �������� - ��������� ������.
    public String getName() {
        return this.model;
    }

    // �������� - ��������� �����.
    public void setColor(String temp) {
        this.color = temp;
    }

    // �������� - ��������� �����.
    public String getColor() {
        return this.color;
    }

    // �������� - ��������� �������.
    public void setRadius(double temp) {
        this.radius = temp;
    }

    // �������� - ��������� �������.
    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return this.model + ", ����(" + this.color + "), ������ = " + this.radius;
    }

    // ��������� ������ ����.
    public Constable getSizeOfABall() {
        DecimalFormat dF = new DecimalFormat( "#.###" );
        final double pi = 3.14;
        double size = 4.0 / 3.0 * Math.pow(radius, 3) * pi;
        return dF.format(size);
    }
}
