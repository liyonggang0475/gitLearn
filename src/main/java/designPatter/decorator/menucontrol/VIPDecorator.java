package designPatter.decorator.menucontrol;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:49
 * @Description:
 */
public class VIPDecorator extends Decorator {
    public VIPDecorator(IMenu baseMenu) {
        super(baseMenu);
    }

    @Override
    void addMenus() {
        getMenus().add("VIPMenu");
    }
}
