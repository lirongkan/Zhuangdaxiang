/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Employee
 * Author:   Administrator
 * Date:     2019-3-21 8:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package yuangong;

public abstract class Employee {
    private String name;
    private int age;

    public Employee(){}

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract  void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}