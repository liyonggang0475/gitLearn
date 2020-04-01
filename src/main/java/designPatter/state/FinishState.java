package designPatter.state;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:38
 * @Description:
 */
public class FinishState implements IState {
    @Override
    public void show() {
        System.out.println("订单完成，欢迎再次选购");
    }
}
