package designPatter.builder;

/**
 * @Author: liyg
 * @Date: 2020-03-15 19:57
 * @Description:
 */
public class Car implements ICar{
    private String brand;
    private String clolor;
    private String oil;

    public Car(String brand, String clolor, String oil) {
        this.brand = brand;
        this.clolor = clolor;
        this.oil = oil;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClolor() {
        return clolor;
    }

    public void setClolor(String clolor) {
        this.clolor = clolor;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    @Override
    public void carInfo() {
        System.out.println("this.brand: " + this.brand + "  \r\n this.clolor: "+ this.clolor +"\n this.oil " + this.oil);
    }
}
