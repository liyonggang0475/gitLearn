package designPatter.singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: liyg
 * @Date: 2020-03-08 22:42
 * @Description: 通过容器实现一系列单例 spring ioc容器
 */
public class ContainerSingleton {

    private static ConcurrentHashMap<String, Object> container = new ConcurrentHashMap<String, Object>();
    public static Object getBean(String className) {

        if(!container.contains(className)){
            Class clazz = null;
            Object object = null;
            try {
                 clazz = Class.forName(className);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                object = clazz.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            container.put(className, object);
            return  object;

        }
        return container.get(className);
    }
}
