package designPatter.chain;

/**
 * @Author: liyg
 * @Date: 2020-03-29 15:00
 * @Description:
 */
public class AcessHandler extends Handler {
    public String role = "admin";

    public AcessHandler(String role) {
        this.role = role;
    }

    @Override
    boolean handle() {
       if(!role.equals("admin")){
           System.out.println("不是管理员，无权访问");
           return false;
       } else{
           System.out.println("管理员访问");
           return true;
        }
    }
}
