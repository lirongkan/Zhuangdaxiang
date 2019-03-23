/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Calendar
 * Author:   Administrator
 * Date:     2019-3-21 21:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) throws Exception {
        function_7();
    }
    public static void function_1(){
        //由于Calendar是抽象类，静态，采用类名.方法名调用方法
        Calendar a = Calendar.getInstance();
        Date nowdate = a.getTime();
        long nowseconds = nowdate.getTime();
        System.out.println(nowseconds);

        Calendar b = Calendar.getInstance();
        b.set(1997,2,27);
        Date mydate = b.getTime();
        long myseconds = mydate.getTime();
        System.out.println(myseconds);

        long liveseconds = nowseconds-myseconds;
        System.out.println(liveseconds/1000/60/60/24);

    }
    public static void function_2() {
        Calendar c = Calendar.getInstance();
        // int year =new Scanner(System.in).nextInt();
        for (int i = 1; i < 10000; i++) {

            c.set(i, Calendar.MARCH, 1);
            c.add(Calendar.DAY_OF_MONTH, -1);
           /* int days = Calendar.DAY_OF_MONTH;这是Calendar类中的常量，固定为5
            如果要赋值，要用set方法
            public final static int DAY_OF_MONTH = 5;*/
            int days = c.get(Calendar.DAY_OF_MONTH);
            if (i % 10 == 0) System.out.println();
            if (28 == days)
                System.out.print(i + "不是闰年 ");
            else
                System.out.print(i + "是闰年 ");

        }
    }
    public static void function_3(){
        Date date = new Date();
        //System.out.println(date);
        long dateseconds = date.getTime();
        //System.out.println(dateseconds);
        String str = date.toString();
        str += "1";
        System.out.println(str);

    }
    public static void function_4(){
        DateFormat df =new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//使用默认格式
        Date date = new Date();
        String str =   df.format(date);
        System.out.println(str);

    }
    public static void function_5() throws Exception{

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = new Scanner(System.in).next();
        Date mydate = df.parse(str);
        long mysec = mydate.getTime();

        long tosec = new Date().getTime();
        long livesec = tosec - mysec;

        System.out.println(livesec/1000/60/60/24+"days");


    }
    public static void function_6(){
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
    public static void function_7(){
        for(int i =1;i<10000;i++) {
            Calendar c = Calendar.getInstance();
            c.set(i, Calendar.DECEMBER, 31);
            int j = c.get(Calendar.DAY_OF_YEAR);
            System.out.println(j);
        }
    }
}

