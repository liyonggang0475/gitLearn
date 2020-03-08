package designPatter.factory.normFactory;

import designPatter.factory.common.IPayment;

public interface IPayFactory {
    IPayment getInstance();
}
