package com.company;

public class BallTest {

    public static void main(String[] args) {
        Ball b1 = new Ball("���_1", "�����", 5.5);
        Ball b2 = new Ball("���_2", "�������", 3.7);
        Ball b3 = new Ball("���_3", "������", 2.5);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setColor("׸���-�����");
        System.out.println("����� ���� " + b3.getName() + " ������ " + b3.getColor());
        System.out.println("����� ���� " + b3.getName() + " ����� " + b3.getSizeOfABall());

    }
}