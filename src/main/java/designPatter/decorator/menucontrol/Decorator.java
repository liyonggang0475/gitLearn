package designPatter.decorator.menucontrol;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:14
 * @Description:
 */
public abstract class Decorator implements IMenu {
    private List<String>  menus = new ArrayList<String>();
    private IMenu baseMenu;

    public Decorator(IMenu baseMenu) {
        this.baseMenu = baseMenu;
        menus.addAll(baseMenu.getMenus());
        addMenus();
    }

    abstract void addMenus();

    @Override
    public void showInfo() {
        System.out.println("当前用户可访问如下模块: " + menus.toString());
    }

    @Override
    public List<String> getMenus() {
        return menus;
    }
}
