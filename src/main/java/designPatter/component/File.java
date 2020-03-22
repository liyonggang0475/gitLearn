package designPatter.component;

/**
 * @Author: liyg
 * @Date: 2020-03-22 19:45
 * @Description:
 */
public class File implements IFile {
    private String name;

    @Override
    public void addFile(IFile file) {

    }

    private int level;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public File(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // 这两个方法对于文件无意义
    @Override
    public void showAll() {
        String preContent = "";
        for (int i = level; i > 0; i--) {
            preContent += "    ";
        }
        System.out.println(preContent + getName());
    }

    @Override
    public void list() {

    }
}
