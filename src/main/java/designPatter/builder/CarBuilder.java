package designPatter.builder;

/**
 * @Author: liyg
 * @Date: 2020-03-15 19:54
 * @Description:
 *
 * 构建模式通常用与构造过程步骤较多，且与顺序无关 比如构造sql串 存在各种条件 只需给条件builder负责构造完整sql并执行插叙返回结果
 * 本例子CarBuilder责创建car， cCarBuilder严重依赖car，必须知道器全部信息 耦合性强，但是外部使用便利 stringBuilder
 *
 * 与工程模式对比看： 工厂是批量生成，全部一致 构建模式则是自定义配置来任意创建
 */
public class CarBuilder {

    private String brand;
    private String clolor;
    private String oil;
    // 设置返回值链式调用 方便使用
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return  this;
    }

    public CarBuilder setClolor(String clolor) {
        this.clolor = clolor;
        return  this;
    }

    public CarBuilder setOil(String oil) {
        this.oil = oil;
        return  this;
    }

    public void reset(){
        this.brand = "";
        this.clolor = "";
        this.oil = "";
    }

    public ICar build(){
        ICar car = new Car(this.brand, this.clolor, this.oil);
        return car;
    }
}
