package com.company;
import java.util.Scanner;

public class Main {

    public static int getF(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите число: ");
        a = inp.nextInt();
        System.out.println(getF(a));
    }
}

