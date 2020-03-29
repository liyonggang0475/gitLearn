package designPatter.strategy;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:36
 * @Description:
 */
public class WeChatPay implements IPay{
    @Override
    public double getMoney() {
        return 200;
    }

    @Override
    public void pay(String key) {
        System.out.println("欢迎使用微信支付");
    }


}
