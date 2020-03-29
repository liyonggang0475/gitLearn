package designPatter.chain;

/**
 * @Author: liyg
 * @Date: 2020-03-29 15:00
 * @Description:
 */
public class ValidateHandler extends Handler {
    public String name;
    public String password;

    public ValidateHandler(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    boolean handle() {
       if(name.isEmpty() || password.isEmpty()){
           System.out.println("账号与密码无效");
           return false;
       } else{
           System.out.println("验证通过");
           return true;
        }
    }
}
