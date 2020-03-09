package designPatter.singleton;

/**
 * @Author: liyg
 * @Date: 2020-03-08 19:54
 * @Description: 懒汉单例 需要是在加载
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static volatile LazySingleton instance;

    // 线程不安全 考虑加锁
    // 过程分析： 输出结果一致： 1.1 正常执行 线程1创建后线程2才走判空满足直接返回正确 1.2线程2覆盖了线程1输出结果均为线程2
    //           输出结果不一致： 线程均满足为空，执行后各自创建各自的并执行输出

//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    // 解决方式1 方法加锁 synchronized 静态方法相当于锁class  普通方法锁定对象 参数可以是this 或者calssName.calss
//    public static  LazySingleton getInstance() {
//        synchronized (LazySingleton.class) {
//            if (instance == null) {
//                instance = new LazySingleton();
//            }
//            return instance;
//        }
//    }
    /// 锁方法和锁整个块效果一致
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

//    // 二次检查 前期保证线程安全后期保证了效率无需判断锁
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            synchronized(LazySingleton.class){
//                if (instance == null) {
//                    instance = new LazySingleton();
//                }
//            }
//        }
//        return instance;
//    }


    // 静态内部类 初始化内部类时初始化instance 利用java语法

    public static LazySingleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static LazySingleton instance = new LazySingleton();
    }
}

