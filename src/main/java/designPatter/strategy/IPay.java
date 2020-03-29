package designPatter.strategy;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:33
 * @Description:
 */
public interface IPay {
    void pay(String key);
    double getMoney();
}
