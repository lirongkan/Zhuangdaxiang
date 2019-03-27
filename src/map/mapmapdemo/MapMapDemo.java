/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MapMapDemo
 * Author:   Administrator
 * Date:     2019-3-27 9:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map.mapmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMapDemo {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        HashMap<String,Integer> hfs = new HashMap<>();
        HashMap<String,Integer> btx = new HashMap<>();
        hfs.put("001",20);
        hfs.put("002",31);
        btx.put("006",40);
        btx.put("008",50);
        HashMap<String ,HashMap<String,Integer>> apple = new HashMap<>();
        apple.put("红富士",hfs);
        apple.put("冰糖心",btx);
        /*//将苹果的种类保存到appleSet中，用 apple.keySet() + apple.get()方法
        Set<String> appleSet = apple.keySet();
        //迭代器
        Iterator<String> appleIt = appleSet.iterator();
        while(appleIt.hasNext()){
            String appleKey = appleIt.next();
            //用apple的get方法获取嵌套的哈希图，用种类kind表示
            HashMap<String,Integer> kind = apple.get(appleKey);
            //重复上一步骤
            Set<String> kindSet = kind.keySet();
            Iterator<String> kindIt = kindSet.iterator();
            while(kindIt.hasNext()){
                String kindKey = kindIt.next();
                Integer kindValue = kind.get(kindKey);
                //注意取名规范，这样打印就方便一些
                System.out.println(appleKey + ".." + kindKey+".."+kindValue);
            }


        }*/
//        Set<Map.Entry<String,HashMap<String,Integer>>> appleEntry = apple.entrySet();
        //用apple.entrySet() + getValue() + getKey()方法
        for(Map.Entry<String,HashMap<String,Integer>> appleEntry:apple.entrySet()){
            String kindKey = appleEntry.getKey();
            HashMap<String,Integer> kind = appleEntry.getValue();
            for(Map.Entry<String,Integer> kindEntry : kind.entrySet()){
                String idKey = kindEntry.getKey();
                Integer sizeValue = kindEntry.getValue();
                System.out.println(kindKey+"."+idKey+"."+sizeValue);
                System.out.println();
            }

        }
    }

}