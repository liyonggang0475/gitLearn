package designPatter.factory.common;

public class Unionpay implements  IPayment {
    @Override
    public void pay() {
        System.out.println("Unionpay is used");
    }
}
