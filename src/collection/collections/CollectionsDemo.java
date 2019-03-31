/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CollectionsDemo
 * Author:   Administrator
 * Date:     2019-3-27 8:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        List<String> list = new ArrayList<>();//多态弊端：只能调用共有的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        System.out.println(list);
        //list.sort();静态方法直接用类名.方法名调用
        Collections.sort(list);
        System.out.println(list);
        int index =Collections.binarySearch(list,"e");
        System.out.println(index);

    }

}