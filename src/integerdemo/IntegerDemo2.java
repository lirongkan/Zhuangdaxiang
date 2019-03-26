/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IntegerDemo
 * Author:   Administrator
 * Date:     2019-3-22 9:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package integerdemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;

public class IntegerDemo2 {
    public static void main(String[] args){

        function_3();
    }

    public static void function_1(){
        Integer in = null;
      in = in +1;
        //in = null.intValue() +1;

        System.out.println(in);
    }

    public static void function(){
      /*  //引用类型 , 引用变量一定指向对象
        //自动装箱, 基本数据类型1, 直接变成了对象

        Integer in = 1; // Integer in = new Integer(1)
        //in 是引用类型,不能和基本类型运算, 自动拆箱,引用类型in,转换基本类型

        //in+1  ==> in.inValue()+1 = 2
        // in = 2    自动装箱*/
        Integer in = 1;
        in = in +1;
        System.out.println(in);
    }
    public static void function_2(){
        /*Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false 地址不同
        System.out.println(i.equals(j));//true 重写equals方法，比较得是对象数据
        */
        //数据在Byte范围内，JVM不会重新new对象
        Integer aa = 127;// Integer aa = new Integer(127)
        Integer bb = 127;// Integer bb = aa;
        System.out.println(aa == bb);//ture
        System.out.println(aa.equals(bb));//ture


    }
    public static void function_3(){
        String str ="123";
        int i = Integer.parseInt(str);
        int j = Integer.valueOf(str);
        System.out.println(i == j);

        String str2 = i + "";
        String str3 = Integer.toString(i);
        String str4 = String.valueOf(i);
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));



    }


}