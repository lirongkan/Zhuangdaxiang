/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BigIntegerDemo
 * Author:   Administrator
 * Date:     2019-3-23 9:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.ROUND_DOWN;

public class BigIntegerDemo {
    public static void main(String[] args){
        BigInteger big1 = new BigInteger("1111111111111111111111");
        BigInteger big2 = new BigInteger("2222222222222222222222");

        BigInteger add1 = big1.add(big2);
        System.out.println(add1);
        BigInteger sub1 = big1.subtract(big2);
        System.out.println(sub1);
        BigInteger mul1 = big1.multiply(big2);
        System.out.println(mul1);
        BigInteger div1 = big1.divide(big2);
        System.out.println(div1);
        function();

    }
    public static  void function() {
        BigDecimal b1 = new BigDecimal("1.0301");
        BigDecimal b2 = new BigDecimal("100");
        //计算b1/b2的商,调用方法divied
        BigDecimal bigDiv = b1.divide(b2, 10, BigDecimal.ROUND_CEILING);//0.01301
        System.out.println(bigDiv);
    }

}