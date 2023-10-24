package com.microsoft.bean;

//  狗类 都具有这些
// 类当中的变量与方法都总称为：属性（共性、特性）

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 注解
@Getter
@Setter
@ToString
// 特殊情况单独写geter seter --方法的重写（详见age函数）
// @Getter @Setter 也可以单独用于一个变量 可以不在类上面写
public class Dogs {
// 成员变量：它们组成和构成了类，所以我们这么命名
    //他们是类的重要组成部分

    //小区名 静态变量
    private static String plot = "NanG";

    // 狗名字
    private String name;
    //public 公有的
    //private 私有的

    // 狗类别
    private String variety;

    // 狗年龄
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

    // 狗食物
    private String food;

    //构造方法
    //创建类时，会自动创建无参数构造方法（无参构造器） ！！！
    public Dogs(){

    }

    public Dogs(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }

    //我们要给用户一个能设置，能获取但不能瞎搞的
    //getset函数 OOP的封装

    // 一个动作，这些方法在类当中，称为 --行为
    private void eat() {
        System.out.println(name + "狗吃了" + food);
    }

    private void Sleep() {
        System.out.println(this.name+"在睡觉");
    }

    private void sick(){
        System.out.println(name+"生病");
    }

    private void crazy(){
        System.out.println(name+"狗疯狂");
    }

    //静态方法 脱离对象,依靠类
    public static void injection(){
        System.out.println("所有的狗 需要打针！");
    }

    public static String getPlotInstance(){
        return plot;
    }

}


