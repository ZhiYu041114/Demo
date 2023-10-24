package com.google.demo;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number[] Arr_1 = new Number[9];
        for (int i = 0; i < 9; i++) {
            if (scanner.hasNextInt()) {
                Arr_1[i] = scanner.nextInt();
            } else if (scanner.hasNextFloat()) {
                Arr_1[i] = scanner.nextFloat();
            }else{
                Arr_1[i] = 0;
            }
        }
        System.out.print(Arr_1[0].longValue() * Arr_1[8].longValue() + Arr_1[2].longValue() * Arr_1[6].longValue());
        scanner.close();
    }
}