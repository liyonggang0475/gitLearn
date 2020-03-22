package designPatter.decorator.menucontrol;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:54
 * @Description:
 */
public class MenuTest {
    public static void main(String[] args) {
        IMenu baseMenu = new BaseMenu();
        baseMenu.showInfo();

        baseMenu = new VIPDecorator(baseMenu);
        baseMenu.showInfo();
    }
}
