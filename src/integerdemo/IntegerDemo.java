/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IntegerDemo
 * Author:   Administrator
 * Date:     2019-3-22 10:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package integerdemo;

public class IntegerDemo {
    public static void main(String[] args){
        function_3();
    }

    public static void function_3(){
    /*    Integer in = new Integer("100");
        //自动封装与解封
        int i = in.intValue();
        int j = in;
        System.out.println(j--);
       
        System.out.println(i--);//100
        System.out.println(--i);//99*/

        String s ="123";
        Integer t = new Integer(s);
//        int m = 123;
        //在[-128,127]不直接创建新对象时（自动装箱），会自动使用原来的空间
        Integer m = 223;
        Integer n =223;
        System.out.println(n == m);//true
        System.out.println(n.equals(m));//true
    }

    public static void function_2(){


        int i = 11;
        String s = i + "";
        System.out.println(s +1);
        Integer j = new Integer("100");
        //第一个参数为整形变量或引用，第二个参数为进制数
        //进制数最大范围是[2,36],若超出，默认为10进制
        //String a = "99"; 若赋值为啊，报错类型必须为int
        String s1 = Integer.toString(j,10);
        System.out.println(s1);

    }
    public static void function_1(){
        int i= Integer.parseInt("12");
        System.out.println(i);
    }
    public static void function(){
        int i= Integer.parseInt("12");
        System.out.println(i/2);
    }
}