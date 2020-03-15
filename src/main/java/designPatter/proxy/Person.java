package designPatter.proxy;

/**
 * @Author: liyg
 * @Date: 2020-03-15 20:44
 * @Description:
 */
public class Person implements IPerson {
    @Override
    public void buyHouse() {
        System.out.println("我要买房子");
    }

    @Override
    public void buyFood() {
        System.out.println("我要买吃的");
    }
}
