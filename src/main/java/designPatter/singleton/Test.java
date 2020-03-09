package designPatter.singleton;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: liyg
 * @Date: 2020-03-08 18:13
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

//        // 此种线程安全可以被反射破坏
//        LazySingleton singleton1 = LazySingleton.getInstance();
//
//        Class clszz = Class.forName("designPatter.singleton.LazySingleton");
//        Constructor cons =  clszz.getDeclaredConstructor();
//        // 设置权限后则可以访问私有方法
//        cons.setAccessible(true);
//        // 可以自己在构造中根据实例变量有值情况给出异常 不建议应该考虑enum java语法上就不支持私有反射
//        LazySingleton singleton2 = (LazySingleton) cons.newInstance();
//
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//        System.out.println(singleton1 == singleton2);
    }
}
