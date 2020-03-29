package designPatter.adapter;

/**
 * @Author: liyg
 * @Date: 2020-03-23 20:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        IThirdPartLogin thirdPartLogin = new LoginAdapter("designPatter.adapter.QQLogin");
        thirdPartLogin.newLogin();

    }
}
