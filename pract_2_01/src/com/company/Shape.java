package com.company;
import java.text.DecimalFormat;
import java.lang.constant.Constable;

public class Shape {
    private String model;
    private String color;

    // ����������� ��� ����������.
    public Shape() {
        this.model = "���";
        this.color = "����";
    }

    // ����������� � �����������.
    public Shape(String model, String color) {
        this.model = model;
        this.color = color;
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

    public String toString() {
        return this.model + ", ����(" + this.color + ")";
    }

}
