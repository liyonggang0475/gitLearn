package designPatter.factory.normFactory;

import designPatter.factory.common.IPayment;
import designPatter.factory.common.VISAPay;

public class VISAPayFactory implements IPayFactory {
    @Override
    public IPayment getInstance() {
        return new VISAPay();
    }
}
