/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MathDemo
 * Author:   Administrator
 * Date:     2019-3-22 13:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package math;

import sun.applet.Main;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args){

        function_7();
    }

    public static void function(){
        int i = Math.abs(-90);
        System.out.println(i);
        int j = Math.abs(-99);
        System.out.println(j);
    }
//Arrays
    public static void function_1(){
        double d = Math.ceil(4.2);
        System.out.println(d);

    }

    public static void function_2(){
        double d = Math.floor(1.23);
        System.out.println(d);
    }
    public static void function_3(){
        double d = Math.pow(2,99);
        System.out.println(d);
    }
    public static void function_4(){
        double d = Math.sqrt(2);
        System.out.println(d);
    }
    public static void function_5() {
        for (int i = 0; i < 10; i++) {
            double d = Math.random()+1;
            System.out.println(d);
        }
    }
    public static void function_6(){
        double d = Math.round(1.22);
        System.out.println(d);
    }
    public static void function_7(){
        System.out.println(Math.PI * Math.E);
    }




}