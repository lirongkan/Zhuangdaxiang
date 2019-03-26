/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: hashMapDemo
 * Author:   Administrator
 * Date:     2019-3-26 14:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){
        function_2();
    }
    public static void function(){
        Map<String, Integer>  map = new HashMap<>() ;
        map.put("a",1);
        map.put("a",11);
        map.put("a",11);
        System.out.println(map);
        map.put("b",11);
        Integer str2 = map.remove("b");
        System.out.println(str2);
        System.out.println(map);
        Integer i = map.get("c");
        System.out.println(i);

    }
    public static void function_1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + " " + value);

        }
    }
     public static void function_2(){
           Map<Integer, String > map = new HashMap<>();
           map.put(111,"aaa");
           map.put(222,"bbb");
           map.put(333,"ccc");

           Set<Map.Entry<Integer,String>> set = map.entrySet();
           Iterator<Map.Entry<Integer,String>> it = set.iterator();
           while(it.hasNext()){
               Map.Entry<Integer,String> entry = it.next();
               System.out.println(entry.getKey() + " " + entry.getValue());

           }

           for(Map.Entry<Integer, String> entry :map.entrySet()){
               System.out.println(entry.getKey() + " " + entry.getValue());


           }


    }

}





