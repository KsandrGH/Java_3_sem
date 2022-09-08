package com.company;

public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book("Пушкин", "Евгений Онегин", 256);
        Book b2 = new Book("Маяковский", "Война и мир", 52);
        Book b3 = new Book("Лермонтов", "Герой нашего времени", 420);

        System.out.println("Автор: " + b1.getAuthor() +"    Название книги: "+ b1.getName() +"    Кол-во страниц: "+ b1.getPage_count());
        System.out.println("Автор: " + b2.getAuthor() +"    Название книги: "+ b2.getName() +"    Кол-во страниц: "+ b2.getPage_count());
        System.out.println("Автор: " + b3.getAuthor() +"    Название книги: "+ b3.getName() +"    Кол-во страниц: "+ b3.getPage_count());

        b3.setPage_count(370);

        System.out.println("Обновлено количество страниц в книге " + b3.getName() + " и теперь равно: " + b3.getPage_count());
    }
}