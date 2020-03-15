package designPatter.proptype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-15 19:09
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 方式1 自己创建对象 自己get set赋值
        Studnet studnet = new Studnet();
        studnet.setAge(1);
        studnet.setName("liyf");
        studnet.setStuNo("20200101");
        List<String> hobbies = new ArrayList();
        hobbies.add("c唱歌");
        hobbies.add("游戏");
        studnet.setHobbies(hobbies);

//        // 方式2 浅拷贝
//        StudentClone studnetClone = new StudentClone();
//        studnetClone.setAge(1);
//        studnetClone.setName("liyf");
//        studnetClone.setStuNo("20200101");
//        List<String> hobbies11 = new ArrayList();
//        hobbies11.add("clone唱歌");
//        hobbies11.add("clone游戏");
//        studnetClone.setHobbies(hobbies11);
//
//        StudentClone clone1 = null;
//        try {
//             clone1 = (StudentClone) studnetClone.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(studnetClone);
//        System.out.println(clone1);
//
//        System.out.println(studnetClone.getHobbies());
//        System.out.println(clone1.getHobbies());
//
////        List<String> hobbies22 = new ArrayList();
////        hobbies22.add("clone唱歌222");
////        hobbies22.add("clone游戏222");
////        clone1.setHobbies(hobbies22);
//        // 原始list同步改动
//        clone1.getHobbies().add("new add");
//        System.out.println(studnetClone.getHobbies().toString());
//        System.out.println(clone1.getHobbies().toString());

        // 深拷贝
        // 方式2 浅拷贝
        DeepCopyStudent deepCopyStudent = new DeepCopyStudent();
        deepCopyStudent.setAge(1);
        deepCopyStudent.setName("liyf");
        deepCopyStudent.setStuNo("20200101");
        List<String> hobbies11 = new ArrayList();
        hobbies11.add("clone唱歌");
        hobbies11.add("clone游戏");
        deepCopyStudent.setHobbies(hobbies11);

        DeepCopyStudent deepCopy = (DeepCopyStudent) deepCopyStudent.deepCopy();

        System.out.println(deepCopyStudent);
        System.out.println(deepCopy);

        System.out.println(deepCopyStudent.getHobbies());
        System.out.println(deepCopy.getHobbies());

        deepCopy.getHobbies().add("new add");
        System.out.println(deepCopyStudent.getHobbies().toString());
        System.out.println(deepCopy.getHobbies().toString());
    }
}
