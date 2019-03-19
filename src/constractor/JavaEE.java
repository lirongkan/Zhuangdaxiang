/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaEE
 * Author:   Administrator
 * Date:     2019-3-19 13:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package constractor;



public class JavaEE extends Develop {
    public JavaEE(String name, int age){
        super(name,age);
    }
    public void work(){
        System.out.println("I am working." + getName() + getAge()) ;

    }
}