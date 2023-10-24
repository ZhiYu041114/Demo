package com.google.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] arr_1 = new int[i];
        for (int j = 0; j < i; j++) {
            number = scanner.nextInt();
            int absNumber = Math.abs(number);
            arr_1[j] = absNumber;
        }
        Arrays.sort(arr_1);
        System.out.println(arr_1[0]);
    }
}