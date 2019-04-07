/**
 * @author: lrk
 * 2019/4/6 22:59
 */
public class Generic {
    public static void main(String[] args) {
        System.out.println((char)97);
       String str = print("abc");
       Integer i =print(2132);
    }
    public static <abc>abc print(abc o){
        return o;

    }

}
