package com.microsoft.bean;

// 实现接口

// 类中的方法我们可以叫做重写
// 接口中： 实现
public class Chinese implements Human{
    @Override
    public void eat() {
        System.out.println("吃中餐");
    }

    @Override
    public void run() {
        System.out.println("小步跑");
    }
}
