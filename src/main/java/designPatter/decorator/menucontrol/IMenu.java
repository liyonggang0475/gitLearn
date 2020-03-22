package designPatter.decorator.menucontrol;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-22 17:10
 * @Description:  根据不同用户设置不同访问权限，控制界面不同的显示菜单效果
 */
public interface IMenu {
    void showInfo();
    List<String> getMenus();
}
