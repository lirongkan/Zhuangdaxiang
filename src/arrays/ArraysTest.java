/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArraysTest
 * Author:   Administrator
 * Date:     2019-3-23 23:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        int[] arr = {12,23,34,45,56,1,9,90};
        Arrays.sort(arr);
       /* String str = Arrays.toString(arr);
        str = str.substring(1,9);
        System.out.println(str);*/

        /*int[] result = new int[3];
        System.arraycopy(arr,0,result,0,3);
        */
       int[] arr2 = new int[3];
       for(int i = 0; i<arr2.length;i++){
           arr2[i] = arr[i];
       }
       String str2 = Arrays.toString(arr2);
       System.out.println(str2);

    }

}