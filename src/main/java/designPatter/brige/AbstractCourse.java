package designPatter.brige;

/**
 * @Author: liyg
 * @Date: 2020-03-23 21:27
 * @Description: jdbc
 */
public abstract class AbstractCourse implements  ICourse{
    // 关联上video note
    private INote note;
    private IVideo video;

    public AbstractCourse(INote note, IVideo video) {
        this.note = note;
        this.video = video;
    }

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }
}
