package designPatter.Commond;

/**
 * @Author: liyg
 * @Date: 2020-04-01 20:40
 * @Description:
 */
public class LightOff implements ICommond {

    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
