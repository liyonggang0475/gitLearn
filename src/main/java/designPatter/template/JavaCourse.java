package designPatter.template;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:23
 * @Description:
 */
public class JavaCourse extends CourseTemplate {
    @Override
    void preparePPT() {

        System.out.println("准备java ppt");
    }

    @Override
    void learning() {
        System.out.println("开始java课程学习 ");
    }

    @Override
    void homework() {
        System.out.println("做java作业 ");
    }

    @Override
    void check() {
        System.out.println("批改作业 java ");
    }

    @Override
    protected boolean needCheck() {
        return true;
    }
}
