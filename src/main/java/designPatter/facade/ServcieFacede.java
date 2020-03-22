package designPatter.facade;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:14
 * @Description: facade就是讲几个子系统整合起来 便于外部客户端的使用，同时完成了对外的封装，便于内部扩展修改
 * 常见的比如jdbcutils  controllor  p5架构实现
 */
public class ServcieFacede {
    private  ServcieA serviceA = new ServcieA();
    private  ServcieB servcieB = new ServcieB();
    private  ServcieC servcieC = new ServcieC();

    public void dosomething(){
        System.out.println("facade dosomething");
    }
}
