package designPatter.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liyg
 * @Date: 2020-03-29 13:57
 * @Description:
 */
public class Leader implements IEmployee{
    private static Map<String, IEmployee> employeeMap = new HashMap<>();

    static {
        employeeMap.put("server", new LiSi());
        employeeMap.put("front", new ZhangSan());
    }
    @Override
    public void doTask(String task) {

        if(employeeMap.containsKey(task)){
            employeeMap.get(task).doTask(task);
        }
        else{
            System.out.println("这个任务我们部门处理不了");
        }
    }
}
