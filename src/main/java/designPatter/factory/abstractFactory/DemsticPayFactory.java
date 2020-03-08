package designPatter.factory.abstractFactory;

import designPatter.factory.common.Alipay;
import designPatter.factory.common.IPayment;
import designPatter.factory.common.Unionpay;
import designPatter.factory.common.Wechatpay;

public class DemsticPayFactory {
    public DemsticPayFactory() {
    }

    public IPayment getAlipay() {
        return new Alipay();
    }

    public IPayment getWechatPay() {
        return new Wechatpay();
    }

    public IPayment getUnionPay() {
        return new Unionpay();
    }
}
