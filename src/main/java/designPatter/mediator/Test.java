package designPatter.mediator;

/**
 * @Author: liyg
 * @Date: 2020-04-05 15:57
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ChatPlatform chatPlatform = new ChatPlatform();
        ZhangSan zhangSan = new ZhangSan("张三", chatPlatform);
        LiSi liSi = new LiSi("李四", chatPlatform);
        WangWu wangWu = new WangWu("王五", chatPlatform);

        chatPlatform.addUser(zhangSan);
        chatPlatform.addUser(liSi);
        chatPlatform.addUser(wangWu);

        chatPlatform.sendMsg("我是张三， 李四在不", liSi, zhangSan);
        chatPlatform.sendMsg("我是李四， 有什么事啊？", zhangSan, liSi);
    }
}
