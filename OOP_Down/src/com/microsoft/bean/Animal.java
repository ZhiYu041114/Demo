package com.microsoft.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 抽象类
public abstract class Animal {
    // 成员变量：它们组成和构成了类，所以我们这么命名
    //他们是类的重要组成部分

    //小区名 静态变量
    private static final String TEXT_COMMUNITY_NAME = "NanG";

    // 名字
    private String name;
    //public 公有的
    //private 私有的

    // 类别
    private String variety;

    // 年龄
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 ||age > 30){
            System.out.println("您输入的数据不合法，已默认清零");
            age = 0;
        }else{
            this.age = age;
        }
    }

    // 食物
    private String food;

    //构造方法
    //创建类时，会自动创建无参数构造方法（无参构造器） ！！！
    public Animal(){

    }

    public Animal(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }

    //我们要给用户一个能设置，能获取但不能瞎搞的
    //getset函数 OOP的封装

    // 一个动作，这些方法在类当中，称为 --行为
    public void eat() {
        System.out.println(this.name + "吃了" + this.food);
    }

    public void sleep() {
        System.out.println(this.name+"在睡觉");
    }

    public void sick(){
        System.out.println(this.name+"生病");
    }

    public void crazy(){
        System.out.println(this.name+"疯狂");
    }

    //静态方法 脱离对象,依靠类
    public static void injection(){
        System.out.println("所有的 需要打针！");
    }

    public static String getPlotInstance(){
        return TEXT_COMMUNITY_NAME;
    }
    // 抽象方法 —— 不能有实际意义
    public abstract void barking();
}
