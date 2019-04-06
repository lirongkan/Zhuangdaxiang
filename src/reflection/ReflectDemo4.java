package reflection;

import java.lang.reflect.Constructor;

/**
 * @author: lrk
 * 2019/4/6 18:20
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
     Class c = Class.forName("reflection.Person");
     Constructor con =  c.getDeclaredConstructor(int.class,String.class);
     con.setAccessible(true);
     Object obj =  con.newInstance(12,"masaka");
     System.out.println(obj);
    }

}
 /*Constructor[] cons = c.getDeclaredConstructors();
        for(Constructor con :cons){
            System.out.println(con);
        }*/
