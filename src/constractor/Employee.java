package constractor;

/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Constractor
 * Author:   Administrator
 * Date:     2019-3-19 13:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public abstract class Employee {
    private String name;
    private int age;

    public abstract void work();

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

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