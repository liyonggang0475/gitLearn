package designPatter.component;

/**
 * @Author: liyg
 * @Date: 2020-03-22 20:05
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        IFile root = new Folder("c盘", 0);
        IFile folder1 = new Folder("1级文件夹", 1);
        IFile folder2 = new Folder("2级文件夹", 2);
        IFile folder3 = new Folder("3级文件夹", 3);

        IFile file1 = new File("1级文件", 1);
        IFile file2 = new File("2级文件", 2);
        IFile file3 = new File("3级文件", 3);

        root.addFile(folder1);
        root.addFile(file1);

        folder1.addFile(folder2);
        folder1.addFile(file2);

        folder2.addFile(folder3);
        folder2.addFile(file3);

        root.list();
        root.showAll();

    }
}
