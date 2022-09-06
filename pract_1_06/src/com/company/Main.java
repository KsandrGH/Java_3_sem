package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        double[] arr_1 = new double[10];
        double[] arr_2 = new double[10];


        for (int i = 0; i < 10; i++) {
            arr_1[i] = Math.random() * 100;
            arr_1[i] = (int)arr_1[i];
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr_2[i] = random.nextDouble() * 100;
            arr_2[i] = (int)arr_2[i];
        }

        System.out.println("\nМассив лучайных чисел, использующий Math.random()");
        System.out.println(Arrays.toString(arr_1));
        Arrays.sort(arr_1);
        System.out.println("Отсортированный массив лучайных чисел, использующий Math.random()");
        System.out.println(Arrays.toString(arr_1));

        System.out.println("Массив лучайных чисел, использующий class Random");
        System.out.println(Arrays.toString(arr_2));
        Arrays.sort(arr_2);
        System.out.println("Отсортированный массив лучайных чисел, использующий class Random");
        System.out.println(Arrays.toString(arr_2));

    }
}