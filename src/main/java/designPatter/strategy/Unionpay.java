package designPatter.strategy;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:36
 * @Description:
 */
public class Unionpay implements IPay{
    @Override
    public double getMoney() {
        return 10;
    }

    @Override
    public void pay(String key) {
        System.out.println("欢迎使用银联支付");
    }


}
