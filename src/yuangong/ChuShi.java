/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ChuShi
 * Author:   Administrator
 * Date:     2019-3-21 8:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package yuangong;

public class ChuShi extends Employee {
    private String name;
    private int age;

    public ChuShi(){}

    public ChuShi(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString(){
        return name +"  "+ age;
    }
    @Override
    public void work(){
        System.out.println("我在煮饭 " + getName()+"  "+ getAge());
    }
}