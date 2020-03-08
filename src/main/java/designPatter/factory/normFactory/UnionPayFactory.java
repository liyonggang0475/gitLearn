package designPatter.factory.normFactory;

import designPatter.factory.common.IPayment;
import designPatter.factory.common.Unionpay;

public class UnionPayFactory implements  IPayFactory {
    @Override
    public IPayment getInstance() {
        return new Unionpay();
    }
}
