package designPatter.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: liyg
 * @Date: 2020-03-15 20:56
 * @Description:
 * 大概流程
 *
 * 1、为接口创建代理类的字节码文件
 *
 * 2、使用ClassLoader将字节码文件加载到JVM
 *
 * 3、创建代理类实例对象，执行对象的目标方法
 *
 *
 *
 * 动态代理涉及到的主要类：
 *
 * java.lang.reflect.Proxy
 * java.lang.reflect.InvocationHandler
 * java.lang.reflect.WeakCache
 * sun.misc.ProxyGenerator
 */
public class DynaProxy implements InvocationHandler {
    private Object target;

    public DynaProxy(Object target) {
        this.target = target;
    }

    public  Object getProxy(){
        // 保存生成的代理类的字节码文件 生成在根目录下
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dobefore xxxxx");
        Object result =  method.invoke(target, args);
        System.out.println("doafter xxxxx");
        return result;
    }


}
