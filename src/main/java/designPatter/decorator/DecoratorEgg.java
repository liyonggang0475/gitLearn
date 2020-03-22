package designPatter.decorator;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:42
 * @Description:  如果没有装饰，随着用户需求变化，产品就需要各种调整，特别不便
 */
public class DecoratorEgg implements ICake {
    private String info;
    private double price;

    private ICake base;

    @Override
    public void print() {
        System.out.println("蛋糕信息：" +  info);
        System.out.println("蛋糕价格：" +  price);
    }

    public DecoratorEgg(ICake base) {
        this.base = base;
        this.info = base.getInfo() + "   加鸡蛋    ";
        this.price = base.getPrice() + 1;
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
