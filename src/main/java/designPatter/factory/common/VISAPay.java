package designPatter.factory.common;

public class VISAPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("visapay is used");
    }
}
