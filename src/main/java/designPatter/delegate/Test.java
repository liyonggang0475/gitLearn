package designPatter.delegate;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
      Leader leader = new Leader();

      leader.doTask("front");
      leader.doTask("server");
      leader.doTask("UI");

    }
}
