package designPatter.delegate;

/**
 * @Author: liyg
 * @Date: 2020-03-29 13:59
 * @Description:
 */
public class ZhangSan implements IEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("我是张三， 我擅长前端");
        System.out.println("我可以做这个任务：" + task);
    }
}
