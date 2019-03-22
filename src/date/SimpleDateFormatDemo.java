/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SimpleDateFormat
 * Author:   Administrator
 * Date:     2019-3-21 22:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args){
    method();
    }
    public static void method(){
        //类名不要重复，加Demo
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        //2019-03-21-22-51-07
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String time = sdf.format(new Date());
        System.out.println(time);*/
    /*  SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd-HH-mm-ss");
      String time = sdf.format(new Date(0));
      System.out.println(time);*/
      SimpleDateFormat aaa = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
      Date d = new Date();
      String time =aaa.format(d);
      System.out.println(time);

    }

}