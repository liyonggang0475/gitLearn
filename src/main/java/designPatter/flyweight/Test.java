package designPatter.flyweight;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:58
 * @Description:  享元是属于共享资源 缓存池 string 编译时对常量进行优化，变量不会 long等保障类同样会缓存
 * 享元（Flyweight）模式的定义：运用共享技术来有効地支持大量细粒度对象的复用。它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 *
 * 享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 *
 * 其主要缺点是：
 * 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 读取享元模式的外部状态会使得运行时间稍微变长。
 *一般会结合工厂
 */
public class Test {

    public static void main(String[] args) {
//        ResourcePool resourcePool = new ResourcePool(1);
//        resourcePool.getResource();
//        resourcePool.getResource();


        String s1 = "hello";
        String s2 = "hel" + "lo";
        String s3 = s1 + s2;
        String s4 = new String("hello");
        String s5 = new String("hel") + "lo";

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false
        System.out.println(s1 == s4); // false

        Integer value1 = Integer.valueOf(127);
        Integer value2 = Integer.valueOf(127);
        System.out.println(value1==value2);

        Integer value3 = Integer.valueOf(128);
        Integer value4 = Integer.valueOf(128);
        System.out.println(value3 == value4);

    }

}
