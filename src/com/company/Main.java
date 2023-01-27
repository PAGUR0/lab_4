package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = in.nextInt();
        int[] massive = new int[length];
        for(int i = 0; i < massive.length; i++){
            System.out.printf("Введите %d элемент массива: ", (i + 1));
            massive[i] = in.nextInt();
        }
        int min = massive[0];
        for (int num : massive) {
            if (min > num) {
                min = num;
            }
        }
        int sum = 0;
        for (int num: massive){
            sum = sum + num;
        }
        int average = sum / massive.length;
        System.out.printf("Сумма среднего арифметического и минимального элемента массива: %d", (average + min));

    }
}
