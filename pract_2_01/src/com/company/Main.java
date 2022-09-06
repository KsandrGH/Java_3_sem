package com.company;
import java.util.Scanner;



public class Main {


    public static class Shape {

        private String forma;

        public Shape(int form) {
            if (form == 1)
            {
                forma = "круг";
            }
            else if (form == 2)
            {
                forma = "прямоугольник";
            }
            else
            {
                forma = "не определена";
            }
        }

        @Override
        public String toString() {

            return "Форма - " + forma;
        }
        
    }
    public static void main(String[] args) {
        Shape b = new Shape(1);
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите число: ");
        b = new Shape(inp.nextInt());
        System.out.println(b);
    }

}
