package designPatter.Commond;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-01 20:48
 * @Description: 遥控器
 */
public class RemoteController {

    List<ICommond> commondlist;

    public RemoteController(List<ICommond> commondlist) {
        this.commondlist = commondlist;
    }

    void doAction(){
        commondlist.forEach(iCommond -> iCommond.execute());
    }
}
