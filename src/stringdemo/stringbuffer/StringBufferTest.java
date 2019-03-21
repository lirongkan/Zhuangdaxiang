/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringBufferTest
 * Author:   Administrator
 * Date:     2019-3-21 16:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo.stringbuffer;

public class StringBufferTest {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,1,3};
        System.out.println(toString(arr));

    }
    public static String toString(int[] arr){
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for(int i =0;i<arr.length;i++){
            if(i == arr.length-1){
                buffer.append(arr[i]).append("]");
            }
            if(i < arr.length-1){
                buffer.append(arr[i]).append(",");

            }

        }
        return buffer.toString();
    }

}