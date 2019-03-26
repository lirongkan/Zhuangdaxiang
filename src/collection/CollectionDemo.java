/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CollectionDemo
 * Author:   Administrator
 * Date:     2019-3-25 12:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args){
        function_2();
    }

    public static void function(){
        Collection<String> coll =new ArrayList<String>();
        boolean b =coll.add("cast");
        boolean b2 = coll.add("cast");
        System.out.println(b +" "+coll);
        int i = coll.size();
        System.out.println(i);
        boolean b3 = coll.remove("cast");
        System.out.println(b3);
        System.out.println(coll);

    }

    public static void function_2(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        coll.add("abc5");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}