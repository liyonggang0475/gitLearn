package designPatter.state;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:38
 * @Description:
 */
public class PackageState implements IState {
    @Override
    public void show() {
        System.out.println("正在打包。。。。");
    }
}
