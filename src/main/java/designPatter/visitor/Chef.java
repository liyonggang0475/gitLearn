package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:27
 * @Description:
 */
public class Chef extends Employee {

    // 厨师关心口味

    @Override
    void visit(Food food) {
        System.out.println("食物的口味： " + food.getTaste());
    }
}
