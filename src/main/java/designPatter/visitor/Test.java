package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:46
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showInfo(new Chef());
        menu.showInfo(new Waiter());
    }
}
