package designPatter.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:07
 * @Description:
 */
public class Menu {

    List<Food> menus = new ArrayList<>();
    private Employee user;

    public Menu() {
        menus.add(new Potato());
        menus.add(new HotPot());
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    void showInfo(Employee user){
        menus.forEach(food -> user.visit(food));
    }
}
