package reflection;

import java.lang.reflect.Method;

/**
 * @author: lrk
 * 2019/4/6 19:36
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
       Class c = Class.forName("reflection.Person");
       Method method =  c.getMethod("sleep",String.class,int.class,double.class);
       Object obj = c   .newInstance();
       method.invoke(obj,"Lrk",8,186);
    }
}
