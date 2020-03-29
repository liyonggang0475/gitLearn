package designPatter.strategy;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:49
 * @Description:
 */
public class Order {

    // 订单
    public static void main(String[] args) {
        StrategyPay strategyPay = new StrategyPay();
        strategyPay.doPay("alipay", 550);

    }
}
