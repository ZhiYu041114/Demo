package com.microsoft.bean;

//继承
public class Dogs extends Animal{
    // 子类方法的重写，拥有自己的特性，不来自于父类
    // 子类自己认为，应该打破父亲的传统，进行革新 革新的内容就是方法体
    // 重写 (不是重载)
    // 重写了父类的方法
    @Override
    public void barking() {
//        super.barking();
        System.out.println("汪汪！");
    }

    public Dogs(){

    }

    public Dogs(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }

    // 反例 修饰
    // final方法 不能被子类重写  可用 但不能为所欲为
    public final boolean isGuideBlindness(){
        return false;
    }
}
