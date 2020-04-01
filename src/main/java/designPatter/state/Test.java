package designPatter.state;

import java.util.Arrays;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.start(Arrays.asList(new PayState(), new PackageState(), new DeliveryState(), new FinishState()));
        order.setState(new PayState());
    }
}
