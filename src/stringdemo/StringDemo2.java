/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringDemo2
 * Author:   Administrator
 * Date:     2019-3-21 14:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringDemo2 {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

}