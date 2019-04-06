package reflection;

import java.lang.reflect.Method;

/**
 * @author: lrk
 * 2019/4/6 19:20
 */
public class ReflectDemo6 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Person");
        /*Method[] method = c.getMethods();
        for(Method m:method){
            System.out.println(m);*/
        Object obj =  c.newInstance();
        Method m = c.getMethod("eat");
        m.invoke(obj);


        }

    }
