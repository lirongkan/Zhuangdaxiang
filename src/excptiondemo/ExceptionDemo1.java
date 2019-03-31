/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ExceptionDemo1
 * Author:   Administrator
 * Date:     2019-3-27 17:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

public class ExceptionDemo1 {
    public static void main (String[] args){
        int[] arr = {};
        try {
            int i = getArray(arr);
            System.out.println(i);
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("Game Over");
    }
    public static int getArray (int[] arr)throws Exception{
        if(arr.length == 0){
            throw new Exception("传递数组为空");
        }
        int i= arr[arr.length-1];
        return i*2;

    }

}