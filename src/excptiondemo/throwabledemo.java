/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: throwabledemo
 * Author:   Administrator
 * Date:     2019-3-27 19:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

public class throwabledemo {
    public static void main(String[] args){
        try {


        function();
        }catch(Exception ex){
            System.out.println(ex.getMessage());//null
            System.out.println(ex.toString());//java.lang.NullPointerException
           ex.printStackTrace();/*java.lang.NullPointerException
	                                at excptiondemo.throwabledemo.function(throwabledemo.java:27)
	                                at excptiondemo.throwabledemo.main(throwabledemo.java:18)
           */
        }
    }
    public static void function(){
        int[] arr =null;
        int i =arr[1];

    }

}