package designPatter.factory.abstractFactory;

import designPatter.factory.common.IPayment;

/**
 * @Author: liyg
 * @Date: 2020-03-08 17:47
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        DemsticPayFactory demsticPayFactory = new DemsticPayFactory();
        IPayment payment = demsticPayFactory.getUnionPay();
        payment.pay();
    }
}
