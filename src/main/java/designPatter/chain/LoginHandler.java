package designPatter.chain;

/**
 * @Author: liyg
 * @Date: 2020-03-29 15:00
 * @Description:
 */
public class LoginHandler extends Handler {
    public LoginHandler(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String name;
    public String password;
    @Override
    boolean handle() {
       if(!(name.equals("liyg") && password.equals("123"))){
           System.out.println("账号与密码错误");
           return false;
       } else{
           System.out.println("登录通过");
           return true;
        }
    }
}
