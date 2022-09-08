package com.company;

public class Book {

    private final String author;
    private final String name;
    private int page_count;

    // ����������� � �����������.
    public Book(String author, String name, int page_count) {

        this.author = author;
        this.name = name;
        this.page_count = page_count;

    }

    // ����������� ��� ����������.
    public Book() {

        this.author = "�����";
        this.name = "��������";
        this.page_count = 50;

    }

    // �������� - ��������� ���-�� �������.
    public void setPage_count(int temp) {

        this.page_count = temp;

    }

    // �������� - ��������� ���-�� ������� �����.
    public int getPage_count() {

        return this.page_count;

    }

    // �������� - ��������� ������.
    public String getAuthor() {

        return this.author;

    }

    // �������� - ��������� �������� �����.
    public String getName() {

        return this.name;

    }

    public String toString() {
        return this.name + ", ����� = " + this.page_count + ", ���-�� ������� = " + this.page_count;
    }
}