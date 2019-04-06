package reflection;

/**
 * 获取一个类的class文件对象的三种方式
 *
 * @author: lrk
 * 2019/4/6 17:13
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        /*对象获取*/
        Person p = new Person();
        Class c =p.getClass();
        System.out.println(c);
        /*类名获取*/
        Class c1 = Person.class;
        System.out.println(c1);
        /*Class类的静态方法获取
        * Class.forName(字符串的类名)包名.类名
        * */
        Class c2 = Class.forName("reflection.Person");
        System.out.println(c2);
    }

}
