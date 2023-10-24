import com.microsoft.bean.*;

public class Application {
    public static void main(String[] args) {
        // Animal本质上是没人用的，它是一个抽象的，它抽取了这些猫狗的特性，作为使用
        // 抽象 --- 具体
        // 动物？--- 狗
        // 抽象的目的是为了概括（解释）这些具体的事物
        Dogs zhangDog = new Dogs("Jerry", "拉布拉多", 2, null);
        zhangDog.setFood("屎");
        System.out.println(zhangDog);

        Cats liCat = new Cats("Tmo", null, 3, null);
        System.out.println(liCat);
        liCat.setFood("猫粮");

        zhangDog.sleep();
        liCat.eat();
        zhangDog.eat();

        System.out.println(Cats.getPlotInstance());
        zhangDog.barking();
        liCat.barking();
        Labrador labrador = new Labrador();
        System.out.println(labrador.isGuideBlindness());

//        Animal animal = new Animal();

        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.run();

        Westerner westerner = new Westerner();
        westerner.eat();
        westerner.run();

        // 匿名内部类
        Human human = new Human(){


            @Override
            public void eat() {

            }

            @Override
            public void run() {

            }
        };


        // 多态

        // 多个行为 功能多了
        // 小吃摊
        // 替父从军 向上转型
        HuaHu huaHu = new HuaMuLan();

        System.out.println(huaHu.name);
        System.out.println(huaHu.age);
        HuaHu.sayMe();
        HuaMuLan.sayMe();
        huaHu.fight();

        // 一天 仗打完了，遇到自己心爱的人了，就要做回自己 向下转型，开始变化
        HuaMuLan huaMuLan = (HuaMuLan) huaHu;
        System.out.println(huaMuLan.name);
        System.out.println(huaMuLan.age);
        huaMuLan.dressing();
        huaMuLan.sayMe();
    }
}
