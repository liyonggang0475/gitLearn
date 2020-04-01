package designPatter.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:05
 * @Description:
 */
public class Container {

    List<ChessMemeto> stepInfo = new ArrayList<>();

    public Container() {
    }

    void save(ChessMemeto memeto){
        stepInfo.add(memeto);
    }

    void undo(ChessMemeto memeto){
        stepInfo.remove(memeto);
    }

    ChessMemeto getLastStep(){
        if(stepInfo.size() > 0){
            return stepInfo.get(stepInfo.size()-1);
        } else {
            return  null;
        }
    }
}
