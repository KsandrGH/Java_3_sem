package com.company;
import java.util.Scanner;




public class Main {


    public static class Book {
        private  int page;

        public Book(int page) {
            this.page = page;
        }

        public Book() {
            this.page = 1;
        }

        @Override
        public String toString() {
            return "���������� ������ � �����: " + page;

        }

        public int getPage(){
            return 2*page;
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1 = new Book(8);
        System.out.println(b1);
        System.out.println("������� � �����: " + b1.getPage());
    }

}
