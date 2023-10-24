package com.google.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取学长要做的事情的数量 n
        int n = scanner.nextInt();

        // 创建一个数组来存储每个事情所花费的时间
        int[] timeSpent = new int[n];

        // 读取每个事情的时间花费，并存储在数组中
        for (int i = 0; i < n; i++) {
            timeSpent[i] = scanner.nextInt();
        }

        // 关闭输入流
        scanner.close();

        // 在这里可以编写处理数据的代码，根据需求进行计算或其他操作
        // 例如，可以计算总时间或其他相关任务

        // 示例：计算总时间
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += timeSpent[i];
        }

        // 打印结果
        System.out.println("学长总共花费的时间是：" + total);
    }
}
