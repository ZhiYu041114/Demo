package com.google.demo;

public class Main {
    public static void main(String[] args) {
        final int ROW_TOTAL = 5 ;
        for (int row_index = 1; row_index <= ROW_TOTAL; row_index++) {
            for (int dollar_boom = 1; dollar_boom <= row_index; dollar_boom++) {
                System.out.print("$");
            }
            System.out.println();
        }
        // debug 打断点 调试
    }
}
