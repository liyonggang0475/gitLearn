package designPatter.adapter;

/**
 * @Author: liyg
 * @Date: 2020-03-23 20:25
 * @Description:
 */
public class QQLogin implements IThirdPartLogin {
    private LoginService loginService = new LoginService();
    @Override
    public void newLogin() {
            System.out.println("qq登录");
            loginService.login("qq123", "qq_password");
    }
}
