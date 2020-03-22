package designPatter.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-22 19:50
 * @Description:
 */
public class Folder implements IFile{
    private String name;
    private int level;
    private List<IFile> child = new ArrayList();
    @Override
    public void rename(String name) {
        this.name = name;
    }

    public Folder(String name, int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public void showAll() {
        String preContent = "";
        for (int i = level; i > 0; i--) {
            preContent += "    ";
        }
        System.out.println(preContent  +getName());
        for (IFile iFile : child) {
            iFile.showAll();
        }

    }

    @Override
    public void  addFile(IFile file){
        child.add(file);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void list() {
        System.out.println("当前文件夹：" +  "+"+ getName());
        String finalPreContent = "  ***";
        child.forEach(iFile -> System.out.println(finalPreContent + iFile.getName()));
    }

}
