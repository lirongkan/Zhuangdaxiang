/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HashMapDemo2_2
 * Author:   Administrator
 * Date:     2019-3-26 19:57
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

public class  HashMapDemo2_2 {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        HashMap<String, Person> map =new HashMap<>();
        Person p1 = new Person("a",1);
        Person p2 = new Person("b",2);
        Person p3 = new Person("c",3);
        Person p4 = new Person("d",4);
       map.put("first",p1);
       map.put("second",p2);
       map.put("third",p3);
       map.put("forth",p4);
        Set<Map.Entry<String, Person>> set = map.entrySet();
        /*for(Map.Entry<String,Person> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());*/
        Iterator<Map.Entry<String,Person>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Person> entry = it.next();
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key + " " + value);
            /*
            * Iterator<Map.Entry<String,Person>> it = set.iterator();
            * */


        }
    }
}
