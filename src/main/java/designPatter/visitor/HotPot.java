package designPatter.visitor;

/**
 * @Author: liyg
 * @Date: 2020-04-05 19:18
 * @Description:
 */
public class HotPot extends Food{

    @Override
    double getPrice() {
        return 100;
    }


    @Override
    String getTaste() {
        return "麻辣";
    }

    @Override
    void accept(Employee employee) {

    }


    @Override
    String getRegion() {
        return "四川";
    }
}
