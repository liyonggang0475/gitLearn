package designPatter.proxy;

/**
 * @Author: liyg
 * @Date: 2020-03-15 20:20
 * @Description:
 *
 * 代理类似中介 可以保护实际对象不可见，同时可以增加其实现，比如增加dobefore doafter
 * 静态代理及硬编码实现，只是针对特定对象的一个函数
 * 动态代理则是一种机制 便于大量场景
 * JDK invokertionHandler 动态生成$proxy0代理类 该类实现代理对象相同接口 利用classLoder加载进来 在相同方法中
 * 调用invokertionHandler的invoker通过反射方式加强后再用代理原始对象方式
 *
 * cglib 对JDK代理进行了优化，范围继承原始类，不在要求接口实现，同时不再使用反射效率更高 框架多用cglib
 * Enhancer可能是CGLIB中最常用的一个类，和Java1.3动态代理中引入的Proxy类差不多(如果对Proxy不懂，可以参考这里)。
 * 和Proxy不同的是，Enhancer既能够代理普通的class，也能够代理接口。Enhancer创建一个被代理对象的子类并且拦截所有
 * 的方法调用（包括从Object中继承的toString和hashCode方法）。Enhancer不能够拦截final方法
 * SampleClass$$EnhancerByCGLIB$$e3ea9b7
 */
public class StaticProxy implements IPerson {
    public StaticProxy(IPerson realObjcet) {
        this.realObjcet = realObjcet;
    }

    private IPerson realObjcet;
    public Object getInstance(){
        return null;
    }
    @Override
    public void buyHouse() {
        System.out.println("我是代理 买房么");
        realObjcet.buyHouse();
        System.out.println("我是代理 恭喜你又放了");

    }

    @Override
    public void buyFood() {
        System.out.println("我是外卖小刚");
        realObjcet.buyFood();
        System.out.println("w外卖送到了 ");
    }
}
