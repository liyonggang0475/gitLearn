package designPatter.singleton;

/**
 * @Author: liyg
 * @Date: 2020-03-08 21:19
 * @Description: 普通类都可以通过反射进行单例破坏
 * <p>
 * 反射创建单例对象
 * <p>
 * 解决方案 : 在构造上述中判断,当多于一个实例时,再调用构造函数,直接报错.
 * <p>
 * 反序列化时创建对象
 * <p>
 * 解决方案 : 使用readResolve()方法来避免此事发生.
 * <p>
 * 这两种缺点虽然都有方式解决,但是不免有些繁琐.
 * <p>
 * 枚举类天生有这些特性.而且实现单例相当简单.
 * 枚举类的特点总结
 * <p>
 * 枚举实例必须在 enum关键字声明的类中显式的指定(首行开始的以第一个分号结束)
 * 除了1, 没有任何方式(new,clone,反射,序列化)可以手动创建枚举实例
 * 枚举类不可被继承
 * 枚举类是线程安全的
 * 枚举类型是类型安全的(typesafe)
 * 无法继承其他类(已经默认继承Enum)
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
