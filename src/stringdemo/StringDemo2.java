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
       String str ="aBcdEF";
       System.out.println(str.length());//6
       System.out.println(str.substring(1));//BcdEF
       System.out.println(str.substring(1,4));//BcdE is wrong ,true Bcd
    }

}