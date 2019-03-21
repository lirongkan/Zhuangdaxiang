/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestEquals
 * Author:   Administrator
 * Date:     2019-3-21 13:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package equals;

import java.util.Random;

public class TestToString {
    public  static void main(String[] args){
        Person p1 = new Person("A",21);
        System.out.println(p1.toString());
        Person p2 = new Person("B",21);
        System.out.println(p2.toString());
        String str1 = p2.toString();
        System.out.println(str1);

        Random r = new Random();
        System.out.println(r.toString());
    }

}