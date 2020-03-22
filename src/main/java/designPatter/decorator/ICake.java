package designPatter.decorator;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:34
 * @Description:
 * io中大量使用此模式 一般流到缓冲流
 * cake接口 装饰类和 基本类均需实现  还应该在抽提一个装饰器的公共接口，统一维护装饰器
 * 1）需要扩展一个类的功能，或给一个类增加附加功能。
 *
 * 2）需要动态的给一个对象增加功能时（可随时撤销）。
 *
 * 3）类似于奶茶的例子，排列组合产生的类太多，继承不现实的情况。
 */
public interface ICake {
    String getInfo();
    double getPrice();
    void print();
}
