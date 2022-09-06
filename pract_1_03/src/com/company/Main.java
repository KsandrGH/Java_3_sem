package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j, sum1 = 0, sum2 = 0, sum3 = 0;
        int num[];

        Scanner inp = new Scanner(System.in);


        System.out.print("Введите количество элементов массива: ");
        i = inp.nextInt();
        num = new int[i];
        for (j=0;j<i;j++) {
            System.out.print("Введите " + (j+1) + "-й элемент: ");
            num[j] = inp.nextInt();
        }

        for (j=0;j<i;j++){
            sum1 += num[j];
        }

        j = i-1;
        while (j > -1){
            sum2 += num[j];
            j--;
        }

        j = i-1;
        do{
            sum3 += num[j];
            j--;
        }
        while (j > -1);

        System.out.print("Сумма элементов массива 3-мя способами: " + sum1 +" "+ sum2 +" "+ sum3);
    }
}