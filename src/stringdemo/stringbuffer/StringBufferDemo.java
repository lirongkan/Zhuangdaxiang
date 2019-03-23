/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringBufferDemo
 * Author:   Administrator
 * Date:     2019-3-21 15:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo.stringbuffer;

public class StringBufferDemo {
    public static void main(String[] args){
        function();
    }

    public static void function(){

        StringBuffer sb =new StringBuffer();




        System.out.println(sb.append("haha"));
        System.out.println(sb.delete(1,2));
        System.out.println(sb.insert(1,"abcde"));
        System.out.println(sb.replace(1,2,"ABC"));
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}