package designPatter.singleton;

/**
 * @Author: liyg
 * @Date: 2020-03-08 18:08
 * @Description:
 */
public class HungrySingleton {
    // 饥汗式 类加载及创建好实例 简单直接 效率高
    // 不适用则浪费 单例多内存消耗大
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
    }

    public  static  HungrySingleton getInstance(){
        return instance;
    }
}
