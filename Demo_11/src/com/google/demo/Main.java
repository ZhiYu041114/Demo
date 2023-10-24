package com.google.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Top_Number = scanner.nextInt();
        int Bottom_Number = scanner.nextInt();
        for (int Now_number = Top_Number; Now_number <= Bottom_Number; Now_number++) {
            System.out.print(Now_number+" "+Now_number*Now_number+" "+Now_number*Now_number*Now_number);
            System.out.println();
        }
    }
}
