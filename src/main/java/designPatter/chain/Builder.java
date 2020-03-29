package designPatter.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:59
 * @Description:
 */
public class Builder {
    private List<Handler> list = new ArrayList<>();

    Builder addHandler(Handler hander){
       list.add(hander);
       return this;
    }

    void handle(){
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).handle()){
                break;
            }
        }
    }
}
