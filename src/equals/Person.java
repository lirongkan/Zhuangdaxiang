/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   Administrator
 * Date:     2019-3-21 13:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package equals;

public class Person extends Object {
    private String name;
    private int age;

    Person(){}

    Person(String name,int age){
    this.name = name;
    this.age =age;
    }

    public String toString(){
        return name + age;
    }

    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            return this.age==p.age;
        }
        if(obj == null){
            return false;
        }
        return false;
    }

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

}