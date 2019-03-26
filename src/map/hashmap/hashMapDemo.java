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
package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        Map<String, Integer>  map = new HashMap<>() ;
        map.put("a",1);
        map.put("a",11);
        map.put("a",11);
        System.out.println(map);

    }

}