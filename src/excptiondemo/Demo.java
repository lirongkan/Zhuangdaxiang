/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Demo
 * Author:   Administrator
 * Date:     2019-3-27 21:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

public class Demo {

    public static void main(String[] args) {
        Test t  = new Test();
        int method = t.method();
        System.out.println(method);
    }
}
class Test{
    public int method(){
        int i = 0;
        try{
            System.out.println(1/0);
            return i;//若这句话执行，则finally里对i的赋值无效；若跳过，则使用finally中的赋值
            /*
            如果try语句里有return，那么代码的行为如下：
            1.如果有返回值，就把返回值保存到局部变量中
            2.执行jsr指令跳到finally语句里执行
            3.执行完finally语句后，返回之前保存在局部变量表里的值
             */
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            i = 100;
            System.out.println("我一定会运行");
        }
        return i;
    }
    //返回路径：每次碰到return就会在返回路径中临时存储这个被返回的值，无论方法内有任何的改变，返回路径中的这个值一致不变。
}