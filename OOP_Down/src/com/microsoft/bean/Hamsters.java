package com.microsoft.bean;

// 当一个类继承一个抽象类时，此时 该子类必须重写父类中所有的抽象方法
public class Hamsters extends Animal{
    @Override
    public void barking() {
        System.out.println("jijiji");
    }
}
