package designPatter.observe;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:17
 * @Description:
 */
public class MouseEventHandler extends EventHandler {
    @Override
    boolean handle(Event event) {
        if(event instanceof MouseMoveEvent){
            onMove(event);
            return true;
        } else if(event instanceof MouseClickEvent) {
            onClick(event);
            return true;
        } else{
            return false;
        }

    }

    void onClick(Event event){
        System.out.println("鼠标单击处理");
    }

    void  onMove(Event event){
        System.out.println("鼠标移动处理");
    }

}
