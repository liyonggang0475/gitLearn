package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:25
 * @Description:
 */
public class Waiter extends Employee {

    // 服务员拿关心价格
    @Override
    void visit(Food food) {
        System.out.println("食物的价格： " + food.getPrice());
    }
}
