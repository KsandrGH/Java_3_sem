package com.company;

public class TestShape {

    public static void main(String[] args) {
        Shape b1 = new Shape("����", "Ƹ����");
        Shape b2 = new Shape("���", "���������");
        Shape b3 = new Shape("�����������", "������");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setColor("�����");
        System.out.println("����� ���� " + b3.getName() + "� ������ " + b3.getColor());

    }
}