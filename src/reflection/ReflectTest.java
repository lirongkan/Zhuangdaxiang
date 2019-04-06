package reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 擦除泛型
 *
 * @author: lrk
 * 2019/4/6 19:48
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        ArrayList<String> array = new ArrayList<>();
        array.add("masaka");
        Class c = array.getClass();
        Method method = c.getMethod("add",Object.class);
        method.invoke(array,121);
        method.invoke(array,"sdfas");
        method.invoke(array,12123);
        System.out.println(array);
        for(Object o:array){
            System.out.println(o);

        }


    }

}
