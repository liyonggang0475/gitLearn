package designPatter.Commond;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-01 20:52
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICommond lightOn = new LightOn(new Light());
        ICommond lightOff = new LightOff(new Light());
        List<ICommond> list = new ArrayList<>();
        list.add(lightOn);
        list.add(lightOff);
        RemoteController remoteController = new RemoteController(list);

        remoteController.doAction();
    }
}
