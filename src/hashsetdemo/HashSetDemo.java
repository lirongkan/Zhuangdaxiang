/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HashSetDemo
 * Author:   Administrator
 * Date:     2019-3-26 13:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package hashsetdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<Person> set = new HashSet<Person>();
       // Person p = new Person("C",90);
        set.add(new Person("A",12));
        set.add(new Person("A",12));
        set.add(new Person("B",18));
        set.add(new Person("B",18));
       // set.add(p);
        System.out.println(set);
        //System.out.println(p);

    }

}