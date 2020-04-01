package designPatter.state;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:42
 * @Description:
 */
public class Order {
    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    IState state;

    public Order() {
    }

    void orderInfo() {
        state.show();
    }

    void start(List<IState> states) {
        states.forEach(iState -> {
            setState(iState);
            orderInfo();
        });
    }


}
