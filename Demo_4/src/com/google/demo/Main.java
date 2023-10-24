package com.google.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str_1 = scanner.nextLine();
        System.out.println(Str_1 + reverse(Str_1));
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString();
    }
}
