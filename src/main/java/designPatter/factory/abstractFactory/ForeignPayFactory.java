package designPatter.factory.abstractFactory;

import designPatter.factory.common.IPayment;
import designPatter.factory.common.VISAPay;

/**
 * @Author: liyg
 * @Date: 2020-03-08 17:40
 * @Description:
 * @Brif: 国外支付方式工厂
 */
public class ForeignPayFactory {
    public ForeignPayFactory() {
    }

    public IPayment getVisaPayment() {
        return new VISAPay();
    }
}
