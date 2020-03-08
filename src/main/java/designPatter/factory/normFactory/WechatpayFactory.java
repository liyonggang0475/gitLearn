package designPatter.factory.normFactory;

import designPatter.factory.common.IPayment;
import designPatter.factory.common.Wechatpay;

public class WechatpayFactory implements IPayFactory {
    @Override
    public IPayment getInstance() {
        return new Wechatpay();
    }
}
