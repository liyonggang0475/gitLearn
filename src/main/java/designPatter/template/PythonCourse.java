package designPatter.template;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:23
 * @Description:
 */
public class PythonCourse extends CourseTemplate {
    @Override
    void preparePPT() {

        System.out.println("准备Python ppt");
    }

    @Override
    void learning() {
        System.out.println("开始Python课程学习 ");
    }

    @Override
    void homework() {
        System.out.println("做Python作业 ");
    }

    @Override
    void check() {
        System.out.println("批改作业 Python ");
    }
}
