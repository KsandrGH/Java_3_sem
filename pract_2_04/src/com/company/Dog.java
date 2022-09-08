package com.company;

public class Dog {

    private String name;
    private int age;

    // ����������� ��� ����������.
    public Dog() {
        this.name = "������";
        this.age = 0;
    }

    // ����������� � ���������� ������ �� ����.
    public Dog(String name) {
        this.name = name;
    }

    // ����������� � ���������� ������ � �������� �� ����.
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // �������� - ��������� ��������.
    public void setAge(int age) {
        this.age = age;
    }

    // �������� - ��������� ��������.
    public int getAge() {
        return age;
    }

    // �������� - ����� �����.
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name + ", ������� " + this.age;
    }

    // ������� �������� ������ � ������������.
    public void toHumanAge() {
        System.out.println("������� ������ �� ������ " + name + " � ������������ ����� - " + age * 7);
    }
}
