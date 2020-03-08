package designPatter.factory.common;

public class Alipay implements IPayment {
    @Override
    public void pay() {
        System.out.println("Alipay is used");
    }
}
