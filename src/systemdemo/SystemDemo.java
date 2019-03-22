/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SystemDemo
 * Author:   Administrator
 * Date:     2019-3-22 13:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package systemdemo;

import equals.Person;

public class SystemDemo {
    public static void main(String[] args){
        function();
    }
    public static void function_4(){
        int[] src = {11,22,33,44,55,66};
        int[] desc ={77,88,99,0};
        //length 不能超过目标数组的长度
        System.arraycopy(src,2,desc,0,4);
        for(int i= 0; i<desc.length;i++){
            System.out.println(desc[i]);
        }
    }

    public static void function_3(){
        System.out.println(System.getProperties());
    }
        //static void gc()
    public static void function_2(){
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.gc();

    }
    public static void function_1(){
        while(true){
            System.out.println("hello");
            System.exit(0);
        }
    }

    public static void function(){
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}