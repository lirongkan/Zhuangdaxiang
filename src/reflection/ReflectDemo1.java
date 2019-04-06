package reflection;

import java.lang.reflect.Constructor;

/**
 * @author: lrk
 * 2019/4/6 17:35
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Person");

        Constructor con = c.getConstructor();
        Object o =con.newInstance();
       /* Person p = (Person)o;
        p.eat();*/
        System.out.println(o);

    }

}

  /*Constructor[] cons = c.getConstructors();
        for(Constructor con :cons){
            System.out.println(con);
        }*/
