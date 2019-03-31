/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DateTestDemo
 * Author:   Administrator
 * Date:     2019-3-22 8:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTestDemo {
    public static void main(String[] args)throws Exception{
      function2();

    }
    public static void function() {
        Calendar c = Calendar.getInstance();
        c.set(1997, 02, 1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    public static void function2() throws Exception{
        System.out.println("请输入生日 yyyy-MM-dd");
        String birthdayString = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);

        Date todayDate = new Date();
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond  - birthdaySecond;
        if(second <=0){
            System.out.println("你还没出生呢！");
        }
        else{
            System.out.println(second/1000/60/60/24);
        }


    }
}