/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestReturn
 * Author:   Administrator
 * Date:     2019-3-21 9:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package testreturn;

public class TestReturn {
    public static void main(String[] args){
        GetAnimal g = new GetAnimal();
       /* g.getAnimal(1).eat();
        g.getAnimal(2).eat();*/
       //抽象类Animal没有对象，只能通过多态调用子类对象的方法
        Animal a = g.getAnimal(1);
        a.eat();
        a.eat();
    }

}