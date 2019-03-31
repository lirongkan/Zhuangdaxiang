/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ExceptionDemo
 * Author:   Administrator
 * Date:     2019-3-27 18:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args){
        try{
        function();
        }catch(ParseException ex){

            }
    }
    public static void function() throws ParseException {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1997-03-27");
        System.out.println(date);

    }

}