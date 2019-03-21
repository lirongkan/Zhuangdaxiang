/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Employee
 * Author:   Administrator
 * Date:     2019-3-18 15:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package extents;

public abstract class Employee {
    private  String name;
    private  String id;

    public abstract  void work();
        public void setId(String id){
        this.id=id;
    }
    public  void setName(String name){
        this.name=name;
    }
    public String  getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}

