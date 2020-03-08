package designPatter.factory.normFactory;

import designPatter.factory.common.Alipay;
import designPatter.factory.common.IPayment;

public class AlipayFactory implements IPayFactory {
    @Override
    public IPayment getInstance() {
        return new Alipay();
    }
}
