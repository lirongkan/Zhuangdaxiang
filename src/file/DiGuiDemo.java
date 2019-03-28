/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DiGuiDemo
 * Author:   Administrator
 * Date:     2019-3-28 12:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file;

public class DiGuiDemo {
    public static void main(String[] args){
//       System.out.println( getSum(1000));
        /*long m = getMul(20);
        System.out.println(m);*/
        int s = Fb(3);
        System.out.println(s);
    }
    public static int getSum(int n){
        if(n == 1) return 1;

        return n+ getSum(n-1);

    }
    public static long getMul(int m ){
        if(m == 1) return 1;
        return m* getMul(m-1);

    }
    public static int Fb(int s){
        if(s == 1)
            return 1;
        if(s == 2)
            return 1;
        return Fb(s -1) +Fb(s-2);

    }
}