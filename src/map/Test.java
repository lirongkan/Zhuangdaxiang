/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   Administrator
 * Date:     2019-3-26 22:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        Map<String ,Person> map =new HashMap<>();
        Person p1 = new Person("hrw",21);
        Person p2 = new Person("zzj",22);
        Person p3 = new Person("ljm",21);
        Person p4 = new Person("mxm",20);
        map.put("q",p1);
        map.put("w",p2);
        map.put("e",p3);
        map.put("r",p4);
//        System.out.println(map);
        Set<String> set = map.keySet();//存的是键值
        Iterator<String> it  = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            Person p = map.get(s);
            System.out.println(s + " " + p);
        System.out.println("===============================");
        for(String m:set){ //set ,map.keySet()都行
            System.out.println(m + "..."+map.get(m));
        }
        }
    }
}