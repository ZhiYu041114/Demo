package com.microsoft.bean;

public class Earth {
    // 单例设计模式
    private static Earth earthInstance = new Earth();

    private Earth() {
    }

    public static Earth getEarthInstance() {
        return earthInstance;
    }

    public void hello(){
        System.out.println("Hello Earth");
    }
}
