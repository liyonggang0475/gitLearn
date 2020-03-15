package designPatter.proptype;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-15 19:15
 * @Description:
 */
public class StudentClone implements  Cloneable{
    private String name;
    private String stuNo;
    private int age;
    private List<String> hobbies;

    public StudentClone() {
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
    @Override
    public Object clone() throws  CloneNotSupportedException{
        // k拷贝仅拷对象的指针 arrayList 实现了cloneable
        return super.clone();
    }
}
