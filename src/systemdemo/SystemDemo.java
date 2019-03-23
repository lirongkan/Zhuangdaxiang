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

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args){
        function_2();
    }
   public static void function_1(){
        long l1 =System.currentTimeMillis();
        System.out.println(l1);
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long l2 =System.currentTimeMillis();
        System.out.println(l2-l1);

   }
   public static void function_2(){
        int[] src ={1,2,3,4,5,6,7,8};
        int[] desc ={9,9,9,9,9,9,9,9};
       System.arraycopy(src,1,desc,1,4);
       StringBuffer sb =new StringBuffer("[");
       for(int i=0;i<desc.length;i++){
           if(i==desc.length-1)
           sb.append(desc[i]+"]");
           else
               sb.append(desc[i]+", ");
       }
       System.out.println(sb.toString());//[9 ,2 ,3 ,4 ,5 ,9 ,9 ,9]
       System.out.println(desc.toString());//[I@1b6d3586
   }


}