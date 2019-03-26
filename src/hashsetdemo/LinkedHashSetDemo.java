/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LinkedHashSet
 * Author:   Administrator
 * Date:     2019-3-26 14:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package hashsetdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<String>();
        set.add("abc1");
        set.add("abc2");
        set.add("abc3");
        set.add("abc4");
        System.out.println(set);//有序的

    }

}