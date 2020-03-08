package designPatter.factory.normFactory;

import designPatter.factory.common.IPayment;

/**
 * @author liyg
 */
public class Test {
    public static void main(String[] args) {

        /// 工厂模式 每中产品对应这一个工厂
        IPayFactory factory = new WechatpayFactory();
        IPayment payment = factory.getInstance();
        payment.pay();

    }
}
