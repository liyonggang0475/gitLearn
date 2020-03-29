package designPatter.brige;

/**
 * @Author: liyg
 * @Date: 2020-03-23 21:27
 * @Description:
 */
public class JavaCourse extends  AbstractCourse{
    public JavaCourse(INote note, IVideo video) {
        super(note, video);
    }

    void  show(){
       System.out.println("javaCourse");
   }
}
