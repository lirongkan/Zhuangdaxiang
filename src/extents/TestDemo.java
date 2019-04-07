/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestDemo
 * Author:   Administrator
 * Date:     2019-3-18 16:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package extents;



public class TestDemo {
    public static void main(String[] args){
        Javaee ee = new Javaee();
        Network net =  new Network();

        ee.setId("e101");
        ee.setName("zhangsan");

        net.setId("n101");
        net.setName("lisi");

        ee.work();
        net.work();
        System.out.println(ee.getName()+"..."+ee.getId());
        System.out.println(net.getName()+"..."+net.getId());
    }


}