package designPatter.singleton;

/**
 * @Author: liyg
 * @Date: 2020-03-08 18:14
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // 饥汉单例
        //HungrySingleton singleton1 = HungrySingleton.getInstance();
        // 懒汉模式
//        LazySingleton singleton1 = LazySingleton.getInstance();

        // 枚举方式 支持反射
        EnumSingleton singleton1 = EnumSingleton.getInstance();
;        System.out.println(singleton1);
        System.out.println(this.getId() + "    run over");
    }
}
