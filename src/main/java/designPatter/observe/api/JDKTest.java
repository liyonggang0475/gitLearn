package designPatter.observe.api;

import com.google.common.eventbus.EventBus;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:48
 * @Description:
 */
public class JDKTest {
    public static void main(String[] args) {
       JDKObserveable jdkObserveable = new JDKObserveable();
       jdkObserveable.addObserver(new JDKObserve());
       jdkObserveable.setData(3);

        EventBus eventBus = new EventBus();
        eventBus.register(new GoogleApi());
        eventBus.post(new Integer(3));
        eventBus.post(new String("cc"));
    }
}
