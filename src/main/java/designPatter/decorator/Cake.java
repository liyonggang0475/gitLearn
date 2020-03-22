package designPatter.decorator;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:36
 * @Description:
 */
public class Cake implements ICake {

    private String info;
    private double price;

    @Override
    public void print() {
        System.out.println("蛋糕信息：" + info);
        System.out.println("蛋糕价格：" + price);
    }

    public Cake(String info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
