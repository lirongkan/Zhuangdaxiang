/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArraysDemo2
 * Author:   Administrator
 * Date:     2019-3-23 23:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo2 {
    public static void main(String[] args){
        int[] arr = {1,5,3,9,7};
        String str = Arrays.toString(arr);
        System.out.println(str);
        Arrays.sort(arr);
        String str2 = Arrays.toString(arr);
        System.out.println(str2);
        int index = Arrays.binarySearch(arr,10);//-6 -本来的位置-1
        int index2 = Arrays.binarySearch(arr,3);//1
        System.out.println(index+ " "+ index2);


    }

}