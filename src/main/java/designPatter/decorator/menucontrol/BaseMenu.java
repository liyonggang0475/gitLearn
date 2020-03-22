package designPatter.decorator.menucontrol;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:12
 * @Description:
 */
public class BaseMenu implements IMenu {

    @Override
    public List<String> getMenus() {
        return menus;
    }

    private List<String>  menus = Arrays.asList("文章", "商城", "互助");

    @Override
    public void showInfo() {
        System.out.println("当前用户可访问如下模块: " + menus.toString());
    }
}
