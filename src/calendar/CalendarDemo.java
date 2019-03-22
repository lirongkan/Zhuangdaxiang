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

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /*//静态方法直接类名调用，
//        Calendar my = new Calendar();
//        Calendar c = new Calendar();
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();


        my.set(Calendar.YEAR, 1997);
        my.set(Calendar.MONTH, 2);
        my.set(Calendar.DATE, 27);
        int day = c.get(Calendar.DATE);
        int myday =my.get(Calendar.DATE);
        System.out.println(day );*/

        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置出生年月日 1995-05-10
        my.set(Calendar.YEAR, 1995);
        my.set(Calendar.MONTH, 4);
        my.set(Calendar.DATE, 10);
        //获取时间中的天数
        /*int day = c.get(Calendar.DATE);
        int myDay = my.get(Calendar.Year);
        System.out.println(day - myDay);*/
        int myyear = my.get(Calendar.YEAR);
        int mymonth = my.get(Calendar.MONTH)+1;
        int myday = my.get(Calendar.DAY_OF_MONTH);
        System.out.println(myyear+"年" +mymonth+"月"+myday+"日");


    }
}

