package designPatter.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:35
 * @Description:
 */
public class StrategyPay {
    static Map<String, IPay> map = new HashMap();

    public StrategyPay() {
        map.put("alipay", new Alipay());
        map.put("wechatpay", new WeChatPay());
        map.put("unionpay", new Unionpay());
    }

    void doPay(String key, double amount){
       IPay payWay = map.get(key);
        if(payWay.getMoney() >= amount){
             payWay.pay(key);
            System.out.println("支付成功");
        }else {
            System.out.println("余额不足。。。");
        }
    }

}
