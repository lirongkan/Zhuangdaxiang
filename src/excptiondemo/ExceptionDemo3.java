/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ExceptionDemo3
 * Author:   Administrator
 * Date:     2019-3-27 19:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

public class ExceptionDemo3 {
    public static void main(String[] args){
        double avg = getAvg(1,2,3,4,5,-6);
        System.out.println(avg);
    }
    public static double getAvg(int...source){
        double sum = 0;
        for(int i : source){
            if(i < 0){
                throw new FuShuException("can't be fushu" +i);
            }
            sum =sum + i;

        }
        return sum/source.length;

    }

}