package designPatter.adapter;

/**
 * @Author: liyg
 * @Date: 2020-03-23 20:23
 * @Description:
 */
public class LoginAdapter implements IThirdPartLogin {

    String className;
    private IThirdPartLogin login;

    public LoginAdapter(String className) {
        this.className = className;
        try {
            Class clazz = Class.forName(className);
            login = (IThirdPartLogin) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// 通过反射获取具体的第三方login

    @Override
    public void newLogin() {
        login.newLogin();
    }
}
