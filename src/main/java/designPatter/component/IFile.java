package designPatter.component;

/**
 * @Author: liyg
 * @Date: 2020-03-22 19:41
 * @Description:
 * 文件 文件夹作为文件系统的组成部分，继承自同一接口ifile 便于操作及处理层级关系
 */
public interface IFile {
    // 显示全部节点信息
    void showAll();
    // 显示子节点
    void list();
    void rename(String name);
    String getName();
   void addFile(IFile file);
}
