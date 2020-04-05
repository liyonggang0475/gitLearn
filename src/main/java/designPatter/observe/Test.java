package designPatter.observe;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:39
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.addEvent(new MouseEventHandler());

        mouse.broadcast(new MouseClickEvent());
        mouse.broadcast(new MouseMoveEvent());
    }
}
