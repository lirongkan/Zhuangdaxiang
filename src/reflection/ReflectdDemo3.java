package reflection;

/**
 * @author: lrk
 * 2019/4/6 18:08
 */
public class ReflectdDemo3 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Person");
        /*Class类中定义方法，直接创建被反射类的对象实例，前提是public，有空参构造器*/
        Object obj = c.newInstance();
        System.out.println(obj);
    }

}
