package designPatter.template;

/**
 * @Author: liyg
 * @Date: 2020-03-29 14:13
 * @Description:
 */
public abstract class CourseTemplate {
    // 定义好具体的流程步骤 一教学上课为例 具体实现类根据自生实际特性实现即可
    // 准备ptt
    abstract void preparePPT();

    // 讲课
    abstract void learning();

    // 作业
    abstract void homework();

    // 批改答疑
    abstract void check();

    void doCourse(){
        preparePPT();

        learning();

        homework();

        if(needCheck()){
            check();
        }
    }

    protected boolean needCheck() {
        return false;
    }
}
