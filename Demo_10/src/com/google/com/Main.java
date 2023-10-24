package com.google.com;

public class Main {
    public static void main(String[] args) {
        char[] arr_1 = {'A','B','C','D','E','F'};
        final int ROW_INDEX = 6;
        for (int i = 0; i <= ROW_INDEX; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr_1[5-j]);
            }
            System.out.println();
        }
    }
}
