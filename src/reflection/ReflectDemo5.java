package reflection;

import java.lang.reflect.Field;

/**
 * @author: lrk
 * 2019/4/6 19:03
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Person");
         /*Field[] fields =  c.getFields();
         for(Field f:fields){
             System.out.println(f);
         }*/
         Field field = c.getField("name");
        Object obj= c.newInstance();
        field.set(obj,"zhangsi");
        System.out.println(obj);
    }

}
