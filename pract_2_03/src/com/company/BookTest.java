package com.company;

public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book("������", "������� ������", 256);
        Book b2 = new Book("����������", "����� � ���", 52);
        Book b3 = new Book("���������", "����� ������ �������", 420);

        System.out.println("�����: " + b1.getAuthor() +"    �������� �����: "+ b1.getName() +"    ���-�� �������: "+ b1.getPage_count());
        System.out.println("�����: " + b2.getAuthor() +"    �������� �����: "+ b2.getName() +"    ���-�� �������: "+ b2.getPage_count());
        System.out.println("�����: " + b3.getAuthor() +"    �������� �����: "+ b3.getName() +"    ���-�� �������: "+ b3.getPage_count());

        b3.setPage_count(370);

        System.out.println("��������� ���������� ������� � ����� " + b3.getName() + " � ������ �����: " + b3.getPage_count());
    }
}