package designPatter.state;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:38
 * @Description:
 */
public class PayState implements IState {
    @Override
    public void show() {
        System.out.println("请及时进行支付");
    }
}
