/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringDemo4
 * Author:   Administrator
 * Date:     2019-3-21 14:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringDemo4 {
    public static void main(String[] args){
        function_11();
    }
    public static void function_9(){

        String str1 = "Abc";
        String str2 = "abc";
        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println(b1);
        System.out.println(b2);
    }
    public static void function_8(){
        String str = "itcast";
        //调用String类方法toCharArray()
        char[] ch = str.toCharArray();
        for(int i =0; i < ch.length;i++){
            System.out.print(ch[i]);
        }
    }

    public static void function_7(){
        String str = "abc";
        byte[] bytes = str.getBytes();
        for(int i =0;i <str.length();i++){
            System.out.println(bytes[i]);
        }

    }
    public static void function_6(){
        String str = "ABCDEFGHIJK";
        int index = str.indexOf('G');
        System.out.println(index);
    }
    public static void function_5(){
        String str = "abcdefghijklmnopqrstuvwxyz";
        boolean b = str.contains("a");
        //System.out.println(b);
        boolean b1 = str.endsWith("z");
        System.out.println(b1);
        boolean b2 = str.startsWith("A");
        System.out.println(b2);
        String sb1 = str.substring(16,21);
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
    public static void function_10(){
        String str ="abcde";
        byte[] by =str.getBytes();
        char[] ch =str.toCharArray();
        for(int i=0; i<str.length();i++){
            System.out.print(ch[i]+" ");
            System.out.print(by[i] + " " );
        }

    }
    public static void function_11(){
        String str1 = "abcde";
        String str2 = "abcde";
        boolean b =str1.equals(str2);
        boolean c = str1.equalsIgnoreCase(str2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str1.toString());

    }

}