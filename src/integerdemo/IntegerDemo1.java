/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IntegerDemo1
 * Author:   Administrator
 * Date:     2019-3-22 10:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args){
    function_1();
    }
    public static void function_1(){
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MIN_RADIX);
    }

}