package designPatter.proptype;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-15 19:32
 * @Description:
 */
public class DeepCopyStudent {
    private String name;
    private String stuNo;
    private int age;
    private List<String> hobbies;

    public DeepCopyStudent() {
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
    // s深拷贝可以通过序列化及json方式实现
    public Object deepCopy(){
        JSON json = (JSON) JSON.toJSON(this);
        DeepCopyStudent copy = json.toJavaObject(DeepCopyStudent.class);
        return copy;
    }

}
