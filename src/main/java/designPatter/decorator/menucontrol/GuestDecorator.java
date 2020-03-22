package designPatter.decorator.menucontrol;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:16
 * @Description:
 */
public class GuestDecorator extends Decorator {

    public GuestDecorator(IMenu baseMenu) {
        super(baseMenu);
    }

    @Override
    void addMenus() {
        getMenus().add("guestMenu");
    }
}
