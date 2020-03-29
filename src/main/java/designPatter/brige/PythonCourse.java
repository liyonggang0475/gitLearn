package designPatter.brige;

/**
 * @Author: liyg
 * @Date: 2020-03-23 21:29
 * @Description:
 */
public class PythonCourse extends AbstractCourse {
    public PythonCourse(INote note, IVideo video) {
        super(note, video);
    }

    void  show(){
        System.out.println("PythonCourse");
    }
}
