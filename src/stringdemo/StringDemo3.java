/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringDemo3
 * Author:   Administrator
 * Date:     2019-3-21 14:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringDemo3 {
    public static void main(String[] args){

        function();
    }
    public static void function_1(){
        /**
         * 功能描述: <br>
         * 〈字符数组转换成字符串〉
         *
         * @param
         * @return:void
         * @since: 1.0.0
         * @Author:Administrator
         * @Date: 2019-3-21 14:46
         */



        char[] ch = {'a','b','c','d','e'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = new String(ch,1,4);
        System.out.println(s1);
    }

    public static void function(){
        /**
         * 功能描述: <br>
         * 〈字节数组转换成字符串〉
         *
         * @param
         * @return:void
         * @since: 1.0.0
         * @Author:Administrator
         * @Date: 2019-3-21 14:45
         */

        byte[] bytes ={65,90,97,48};
        String s = new String(bytes);
        System.out.println(s);

        String s2 = new String(bytes,1,2);
        System.out.println(s2);
    }

    public static void function_2(){
        byte[] byte2 ={106,110,112,116,117};
        String str2 = new String(byte2);
        System.out.println(str2);
    }
    public static void function_3(){
        char[] ch3 = {'j','n','p','s','u'};
        String str3 = new String(ch3);
        System.out.println(str3);
    }
}