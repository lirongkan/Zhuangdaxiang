/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JinLi
 * Author:   Administrator
 * Date:     2019-3-21 8:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package yuangong;

public class JinLi extends Employee implements Vip{
    private double money;

   /* public JinLi(double money) {
        this.money = money;
    }

    public JinLi(String name, int age, double money) {
        super(name, age);
        this.money = money;
    }*/

   public JinLi(){

   }

    public JinLi(double money) {
        this.money = money;
    }

    public JinLi(String name, int age, double money) {
        super(name, age);
        this.money = money;
    }

    public void setMoney(double money){
        this.money = money;
    }
    public double getMoney(){
        return money;
    }

    public void service(){
        System.out.println("我的服务"+" 发钱" +getMoney());
    }
    public void work(){
        System.out.println("我是经理我会发钱"+getName()+"发钱");
    }

}