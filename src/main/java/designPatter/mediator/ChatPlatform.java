package designPatter.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-04-05 15:34
 * @Description:
 * 聊天平台就是一个介者
 */
public class ChatPlatform {

    List<User> users = new ArrayList<>();
    void sendMsg(String msg, User to, User from){
        from.sendMsg(msg, to);
    }

    void addUser(User user){
        users.add(user);
    }

}
