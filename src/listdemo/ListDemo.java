/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ListDemo
 * Author:   Administrator
 * Date:     2019-3-26 8:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        function();
    }


    public static void function() {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc5");
        System.out.println(list);
     /*   String str1 = list.get(0);
        System.out.println(str1);
        */
     String str  = list.remove(0);
        System.out.println(str);
        System.out.println(list);
     System.out.println(list.get(0));
    }
}