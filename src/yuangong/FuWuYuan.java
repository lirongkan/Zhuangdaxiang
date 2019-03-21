/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FuWuYuan
 * Author:   Administrator
 * Date:     2019-3-21 8:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package yuangong;

public class FuWuYuan extends Employee {
    public FuWuYuan() {
    }

    public FuWuYuan(String name, int age){
        super(name,age);

    }
    public void work(){
        System.out.println("我在服务 "+getName()+" "+getAge());
    }
}