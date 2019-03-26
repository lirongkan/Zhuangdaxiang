/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: VarParDemo
 * Author:   Administrator
 * Date:     2019-3-26 20:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map;

public class VarParDemo {
    public static void main(String[] args){
        int i = getSum();
        int j = getSum(1,2,3,4,5,6);
        int k = getSum(9,8,7,6,5,4);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    public static int getSum (int...a){
        int sum =0;
        for(int i:a){
            sum += i;
        }
        return sum;


    }
}