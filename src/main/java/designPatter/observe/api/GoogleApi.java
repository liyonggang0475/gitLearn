package designPatter.observe.api;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: liyg
 * @Date: 2020-04-05 17:05
 * @Description:
 */

public class GoogleApi {
    @Subscribe
    // objcet用来区分事件类别
    void update(Integer value){
        System.out.println("google观察对象变化了Integer，注意响应啊");
     }
    @Subscribe
    void update(String value){
        System.out.println("google观察对象变化了String，注意响应啊");
    }

}
