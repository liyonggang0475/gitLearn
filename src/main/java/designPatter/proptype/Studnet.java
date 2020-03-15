package designPatter.proptype;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-15 18:59
 * @Description:
 *
 * 原型设计模式：当构造函数操作复杂 或者资源消耗到时直接获取方便 使用copy或则clone
 * 实现接口clodneable 但是均为浅拷贝， 对于复杂对象比如list是共享的，深拷贝才能解决此问题
 * 深拷贝： 序列化反序列化方式实现， 或者json方式处理
 *  原型模式和单例模式时对立的， 原型破坏单例，clone是会调用构造
 */
public class Studnet {

    private String name;
    private String stuNo;
    private int age;
    private List<String> hobbies;

    public Studnet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
