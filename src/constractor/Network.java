/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Network
 * Author:   Administrator
 * Date:     2019-3-19 14:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package constractor;

public class Network extends Maintainer {
    public Network(String name, int age){
        super(name, age);
    }
    public void work(){
        System.out.println("I am net."+ getName() + this.getAge() );
    }

}