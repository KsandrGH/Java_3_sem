package com.company;

public class Book {

    private final String author;
    private final String name;
    private int page_count;

    // Конструктор с параметрами.
    public Book(String author, String name, int page_count) {

        this.author = author;
        this.name = name;
        this.page_count = page_count;

    }

    // Конструктор без параметров.
    public Book() {

        this.author = "Автор";
        this.name = "Название";
        this.page_count = 50;

    }

    // Свойство - изменение кол-ва страниц.
    public void setPage_count(int temp) {

        this.page_count = temp;

    }

    // Свойство - получение кол-ва страниц книги.
    public int getPage_count() {

        return this.page_count;

    }

    // Свойство - получение автора.
    public String getAuthor() {

        return this.author;

    }

    // Свойство - получение названия книги.
    public String getName() {

        return this.name;

    }

    public String toString() {
        return this.name + ", Автор = " + this.page_count + ", Кол-во страниц = " + this.page_count;
    }
}