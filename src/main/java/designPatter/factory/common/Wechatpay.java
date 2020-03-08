package designPatter.factory.common;

public class Wechatpay implements IPayment {
    @Override
    public void pay() {
        System.out.println("wechatpay is used");
    }
}
