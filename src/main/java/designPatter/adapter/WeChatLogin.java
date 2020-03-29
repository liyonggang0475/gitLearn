package designPatter.adapter;

/**
 * @Author: liyg
 * @Date: 2020-03-23 20:30
 * @Description:
 */
public class WeChatLogin implements IThirdPartLogin {
    private LoginService loginService = new LoginService();
    @Override
    public void newLogin() {
            System.out.println("WeChat登录");
            loginService.login("WeChat123", "WeChat_password");
    }
}
