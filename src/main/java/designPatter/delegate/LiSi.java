package designPatter.delegate;

/**
 * @Author: liyg
 * @Date: 2020-03-29 13:59
 * @Description:
 */
public class LiSi implements IEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("我是李四， 我擅长后端");
        System.out.println("我可以做这个任务：" + task);
    }
}
