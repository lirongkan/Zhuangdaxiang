/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   Administrator
 * Date:     2019-3-26 13:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package hashsetdemo;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;

    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    Person(){}
    Person(String name,int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}