package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:07
 * @Description:
 */
public abstract class Food {
    String taste;
    double price;
    String region;

    abstract void accept(Employee employee);

    abstract double getPrice();
    abstract  String getTaste();
    abstract String getRegion();
}
