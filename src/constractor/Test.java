/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   Administrator
 * Date:     2019-3-19 14:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package constractor;

public class Test {
    public static  void main(String[] args){
        JavaEE ee = new JavaEE("AA",12);
        ee.work();
        Network net = new Network("BB",22);
        net.work();

    }

}