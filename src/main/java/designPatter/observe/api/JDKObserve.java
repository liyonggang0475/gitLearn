package designPatter.observe.api;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:42
 * @Description:
 */
public class JDKObserve implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察对象变化了，注意响应啊");
    }
}
