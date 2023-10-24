import com.microsoft.bean.Dogs;
import com.microsoft.bean.Earth;

public class Application {
    public static void main(String[] args) {
        //对象 -- 实例
        //实例： 现实生活中的一个东西，对抽象的东西进行表示出来的产物
        //实例： 是一个活生生的事物，他是唯一的。

        // 初始化对象
        Dogs zhangDogs = new Dogs("Tom","拉布拉多",2,null);
        // 非初始化对象
        Dogs wangDogs = new Dogs();

        //设置狗的信息
//        zhangDogs.name = "Jerry";
//        zhangDogs.setAge(21);
        System.out.println(zhangDogs.getAge());
//        zhangDogs.variety = "拉布拉多";
        //账户注销
//        zhangDogs = null;

//        wangDogs.name = "Tom";
//        wangDogs.age = 2;
//        wangDogs.variety = "藏獒";
//        wangDogs.food = "屎";


//        System.out.println("张大爷家的狗叫:"+zhangDogs.name);
            zhangDogs.Sleep();
//        wangDogs.eat();
//        zhangDogs.setName("Tom");
//        zhangDogs.setFood("屎");
//        zhangDogs.setVariety("拉布拉多");
        System.out.println("张大爷的狗叫"+zhangDogs.getName());
        System.out.println("zhangDogs = " + zhangDogs);

        //垃圾回收机制
//        System.gc();
        System.out.println("Dogs.plot = " + Dogs.getPlotInstance());
        Dogs.injection();

        Earth earthInstance = Earth.getEarthInstance();
        earthInstance.hello();

        // 内部类
//      Dogs.Sun zhangDogs = new Dogs.Sun();

    }
}