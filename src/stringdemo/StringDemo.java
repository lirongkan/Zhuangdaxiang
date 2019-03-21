/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringDemo
 * Author:   Administrator
 * Date:     2019-3-21 14:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringDemo {
    public static void main(String[] args){
        //引用变量str执行内存变化
        //定义好的字符串对象不变
        String str  = "itcast";
        System.out.println(str);
        str = "hahahah";
        System.out.println(str);
    }

}