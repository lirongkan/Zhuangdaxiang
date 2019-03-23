/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringDemo1
 * Author:   Administrator
 * Date:     2019-3-23 17:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringDemo1 {
    public static void main(String[] args){
        String str ="abcDEFgHi";

        boolean b = str.endsWith("i");
        System.out.println(str.startsWith("a",1));
        System.out.println(b);
        System.out.println(str.contains("EFg"));
        System.out.println(str.indexOf("D"));
    }

}