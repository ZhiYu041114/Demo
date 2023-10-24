package com.microsoft.bean;

// Cat 子类
// Animal 父类
public class Cats extends Animal{
    @Override
    public void barking() {
//        super.barking();
        System.out.println("喵喵!");
    }

    public Cats() {
    }

    public Cats(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }
}
