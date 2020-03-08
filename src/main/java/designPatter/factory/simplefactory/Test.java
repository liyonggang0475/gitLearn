package designPatter.factory.simplefactory;

import designPatter.factory.common.Alipay;
import designPatter.factory.common.IPayment;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SimpleFactory simpleFactory = new SimpleFactory();
//        IPayment iPayment = simpleFactory.getPayment("alipay");

        // 反射方式
        IPayment iPayment = simpleFactory.getPayment(Alipay.class);
        iPayment.pay();
    }
}