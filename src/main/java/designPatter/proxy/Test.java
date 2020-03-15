package designPatter.proxy;

/**
 * @Author: liyg
 * @Date: 2020-03-15 20:46
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 静态代理比较不用 属于硬编码方式
        StaticProxy staticProxy = new StaticProxy(new Person());
        staticProxy.buyFood();
        staticProxy.buyHouse();

        // 动态代理实现

        IPerson proxy = (IPerson) new DynaProxy(new Person()).getProxy();
        proxy.buyFood();
        proxy.buyHouse();
    }
}
