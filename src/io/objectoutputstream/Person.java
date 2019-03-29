/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   Administrator
 * Date:     2019-3-29 23:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.objectoutputstream;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private  /*transient阻止成员变量序列化*/ int age;
    //类,自定义了序列号,编译器不会计算序列号
    private static final long serialVersionUID = 1478652478456L;


    Person() {
    }

    Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}