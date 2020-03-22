package designPatter.decorator;

import java.io.*;

/**
 * @Author: liyg
 * @Date: 2020-03-22 16:53
 * @Description:
 */
public class CakeTest {
    public static void main(String[] args) {
        ICake cake = new Cake("普通蛋糕", 5);
        // 加个鸡蛋
        cake = new DecoratorEgg(cake);
        // 加个辣条
        cake = new DecoratorLatiao(cake);
        cake.print();

        File file = new File("c:\\test.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
