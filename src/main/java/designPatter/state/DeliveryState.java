package designPatter.state;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:38
 * @Description:
 */
public class DeliveryState implements IState {
    @Override
    public void show() {
        System.out.println("正在运输。。。");
    }
}
