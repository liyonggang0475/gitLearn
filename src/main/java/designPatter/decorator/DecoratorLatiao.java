package designPatter.decorator;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:50
 * @Description:
 */
public class DecoratorLatiao implements ICake {
    private String info;
    private double price;

    private ICake base;

    @Override
    public void print() {
        System.out.println("蛋糕信息：" +  info);
        System.out.println("蛋糕价格：" +  price);
    }
    public DecoratorLatiao(ICake base) {
        this.base = base;
        this.info = base.getInfo() + "   加辣条    ";
        this.price = base.getPrice() + 1.5;
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
