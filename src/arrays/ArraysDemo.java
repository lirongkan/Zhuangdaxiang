/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArraysDemo
 * Author:   Administrator
 * Date:     2019-3-22 13:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package arrays;



import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        //function_2();
        int[] arr = {12,34,24,6436,85,345,53};
        Arrays.sort(arr);
//        String newArray = Arrays.toString(arr);
//        newArray += "1";
//        System.out.println(newArray);
        /*int[] arr2 = new int[3];
        for (int i= 0; i< 3;i++){
            arr2[i] = arr[i];
        }*/
        int[] arr2 = new int[3];
        System.arraycopy(arr,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));

    }


    public static int[] test(int[] arr){
        Arrays.sort(arr);

        int[] result = new int[3];
        System.arraycopy(arr,0,result,0,3);

        for(int i=0;i<3;i++){
            result[i] = arr[i];
        }
        return result;
    }

    public static void function(){
        int[] arr ={2,34,523,5,2367,1};
        Arrays.sort(arr);
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void function_1(){
        int[] arr ={1,2,3,42,3,2,3,21};
        int index = Arrays.binarySearch(arr,3);
        System.out.println(index);

    }
    public static void function_2(){
        int[] arr = {2,3,4,6,4,3};
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

}