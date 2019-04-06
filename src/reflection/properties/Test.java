package reflection.properties;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: lrk
 * 2019/4/6 21:01
 */
public class Test {
    public static void main(String[] args) throws Exception {

        /*创建流读取配置文件*/
        FileReader fr = new FileReader("src\\config.properties");
        /*创建Properties集合读取流*/
        Properties pro = new Properties();
        pro.load(fr);
        /* 从配置文件中获取集合元素*/
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        /*开始反射，先取得类名，然后方法名*/
        Class c = Class.forName(className);
        Method method =  c.getMethod(methodName);
        Object obj = c.newInstance();
        method.invoke(obj);

    }
}
