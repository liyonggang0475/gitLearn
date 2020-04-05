package designPatter.mediator;

/**
 * @Author: liyg
 * @Date: 2020-04-05 15:36
 * @Description:
 */
public abstract class User {
    String name;

    public User(String name, ChatPlatform chatPlatform) {
        this.name = name;
        this.chatPlatform = chatPlatform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatPlatform getChatPlatform() {
        return chatPlatform;
    }

    public void setChatPlatform(ChatPlatform chatPlatform) {
        this.chatPlatform = chatPlatform;
    }

    ChatPlatform chatPlatform;

    void sendMsg(String msg, User to) {
        System.out.println(to.getName() + " 你有新消息了");
        System.out.println(getName() + " :  " + msg);
    }
}
