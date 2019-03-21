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
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcdefg");
        buffer.append(123456);
       // System.out.println(buffer);
        //String s = buffer.toString();
        buffer.reverse();
        System.out.println(buffer);
        /*buffer.replace(1,2,"aaa");
        System.out.println(buffer);*/
        buffer.insert(0,1);
        System.out.println(buffer);
        buffer.delete(0,1);
        System.out.println(buffer);
        buffer.append("23").append(12);
        System.out.println(buffer);
        String str = buffer.toString();
        System.out.println(str);
    }
}