package designPatter.Commond;

/**
 * @Author: liyg
 * @Date: 2020-04-01 20:40
 * @Description: 通过命令将执行过程解耦，且支持批量执行
 */
public class LightOn implements ICommond {

    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
