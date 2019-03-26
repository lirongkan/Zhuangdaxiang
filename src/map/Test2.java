/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test2
 * Author:   Administrator
 * Date:     2019-3-26 22:21
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

public class Test2 {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        Map<Person,Integer> map = new HashMap<>();
        map.put(new Person("aa",97),1);
        map.put(new Person("bb",98),2);
        map.put(new Person("cc",99),3);
        map.put(new Person("dd",100),4);
//        System.out.println(map);
        Set<Map.Entry<Person,Integer>> set =map.entrySet();
       /* Iterator<Map.Entry<Person,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Person,Integer> entry = it.next();
            System.out.println(entry.getKey()+"..."+entry.getValue());*/

        for(Map.Entry<Person,Integer> entry : set){
             System.out.println(entry.getKey() + "..."+entry.getValue());
        }
    }



}

