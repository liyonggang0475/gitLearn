package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:15
 * @Description:
 */
public class Potato extends Food{

    @Override

    double getPrice() {
        return 6;
    }

    @Override

    String getRegion() {
        return "东北";
    }

    @Override
    void accept(Employee employee) {
       employee.visit(this);
    }

    @Override

    String getTaste() {
        return "酸甜";
    }
}
