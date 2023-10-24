package com.google.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] Arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            Arr_1[i] = scanner.nextInt();
        }
        int[] Arr_2 = reverse(Arr_1, Arr_1.length);

        for (int element : Arr_2) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] a, int n) {
        int[] Arr_2 = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            Arr_2[j - 1] = a[i];
            j = j - 1;
        }
        return Arr_2;
    }
}