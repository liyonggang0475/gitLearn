package designPatter.facade;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:18
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 常规方式 注意使用
//        ServcieA serviceA = new ServcieA();
////        ServcieB servcieB = new ServcieB();
////        ServcieC servcieC = new ServcieC();
////
////        serviceA.doSomething();
////        servcieB.doSomething();
////        servcieC.doSomething();

        // facede 模式
        ServcieFacede facede = new ServcieFacede();
        facede.dosomething();
    }
}
