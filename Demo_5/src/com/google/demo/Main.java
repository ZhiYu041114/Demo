package com.google.demo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str_1 = scanner.next();
        String Str_2 = scanner.next();
        String Str_3 = scanner.next();
        String Str_4 = scanner.next();
        String Str_5 = scanner.next();
        int a,b,c,d,e;
        a = Str_1.length();
        b = Str_2.length();
        c = Str_3.length();
        d = Str_4.length();
        e = Str_5.length();

        if (a > b&&a>c&&a>d&&a>e){
            System.out.print(Str_1);
        }else if (b>a&&b>c&&b>d&&b>e){
            System.out.print(Str_2);
        }else if(c>a&&c>b&&c>d&&c>e){
            System.out.print(Str_3);
        }else if(d>a&&d>b&&d>c&&d>e){
            System.out.print(Str_4);
        }else if(e>a&&e>b&&e>c&&e>d){
            System.out.print(Str_5);
        }
    }
}
