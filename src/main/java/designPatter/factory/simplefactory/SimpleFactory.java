package designPatter.factory.simplefactory;

import designPatter.factory.common.*;

import java.lang.reflect.InvocationTargetException;

// 简单工厂根据关键字返回对应支付方式
// 支付方式包括跨境支付  微信  支付宝  银联
public class SimpleFactory {
    public SimpleFactory() {
    }
    /// if判断或者枚举方式
    public IPayment getPayment(String payment) {
        if ("visa".equals(payment)) {
            return new VISAPay();
        } else if ("alipay".equals(payment)) {
            return new Alipay();
        } else if ("wechatpay".equals(payment)) {
            return new Wechatpay();
        } else if ("unionpay".equals(payment)) {
            return new Unionpay();
        }
        return  null;
    }

    // 反射方式实现
    public IPayment getPayment(Class<? extends IPayment> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if(clazz != null){
            return  clazz.getConstructor().newInstance();
        }
        return null;
    }


}
