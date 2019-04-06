package reflection;

import java.lang.reflect.Constructor;

/**
 * @author: lrk
 * 2019/4/6 17:53
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Person");
        Constructor con = c.getConstructor(String.class,int.class);
        Object obj = con.newInstance("张三",20);
        System.out.println(obj);
    }

}
