/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HashMapDemo2
 * Author:   Administrator
 * Date:     2019-3-26 19:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(new Person("A", 21),1);
        map.put(new Person("B", 22),2);
        map.put(new Person("C", 23),3);
        Set<Person> set = map.keySet();
        Iterator<Person> it = set.iterator();
        while(it.hasNext()){
            Person p = it.next();
            Integer value = map.get(p);
            System.out.println(p + " "+  value);
            /*for(Person p2:set){
                System.out.println(p2 + " " + map.get(p2));*/
            }

        }


}
