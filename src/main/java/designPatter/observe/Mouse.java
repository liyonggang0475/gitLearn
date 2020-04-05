package designPatter.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:15
 * @Description:
 */
public class Mouse {

    List<EventHandler> eventHandlers = new ArrayList<>();

    void addEvent(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    void broadcast(Event event){
        eventHandlers.forEach(eventHandler -> eventHandler.handle(event));
    }

}
