/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegexDemo1
 * Author:   Administrator
 * Date:     2019-3-21 21:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package regex;

public class RegexDemo1 {
    public static void main(String[] args){
        method1();
    }
    public static void method1(){
    String ip = "192 .16        8.1 05.2 7";
    //        String[] strArr = ip.split("//.");//转义字符是反斜杠！！
        //" +"表示匹配一个或多个空格
    String[] strArr = ip.split(" +");
        System.out.println("拆分为 "+ strArr.length);
        for(int i= 0; i < strArr.length;i++) {
            System.out.println(strArr[i]);
        }
    }
    public static void method2(){
        String str ="awesfsd234256fg32sdf23sdf32";
        str = str.replaceAll("[\\d]+","@");
        System.out.println(str);
    }
}