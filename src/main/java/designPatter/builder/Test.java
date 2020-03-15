package designPatter.builder;

/**
 * @Author: liyg
 * @Date: 2020-03-15 20:12
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
//        CarBuilder carBuilder = new CarBuilder();
//        carBuilder.setBrand("benz");
//        carBuilder.setClolor("white");
//        carBuilder.setOil("5L");
//        carBuilder.build().carInfo();
        // 链式调用
        new CarBuilder().setBrand("BMW").setClolor("Red").setOil("3L").build().carInfo();
    }
}
