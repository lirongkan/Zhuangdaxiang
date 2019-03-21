/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestEquals
 * Author:   Administrator
 * Date:     2019-3-21 13:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package equals;

public class TestEquals {
    public static void main(String[] args){
        Person p1 = new Person("A",21);

        Person p2 = new Person("B",21);
        boolean b = p1.equals(p2);
        System.out.println(b);
        boolean c = new Person("C",22).equals(p1);
        System.out.println(c);
    }



}