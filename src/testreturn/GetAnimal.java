/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GetAnimal
 * Author:   Administrator
 * Date:     2019-3-21 8:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package testreturn;

public class GetAnimal {
    public Animal getAnimal(int num ){
        /*if(1 == num ) {
            Animal a = new Cat();
            return a;
        }else{
                Animal b = new Dog();
                return b;
        }*/
        if(1 == num)
            //调用匿名对象
            return new Cat();
        return new Dog();

    }
}

