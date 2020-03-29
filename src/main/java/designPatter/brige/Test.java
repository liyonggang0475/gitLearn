package designPatter.brige;

import java.sql.SQLException;

/**
 * @Author: liyg
 * @Date: 2020-03-23 21:36
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        JavaCourse javaCourse = new JavaCourse(new JavaNote(), new JavaVideo());
//        javaCourse.show();

        // drive有一个静态代码块赋值注册到manager
        Class.forName("com.mysql.jdbc.Driver");

    }
}
