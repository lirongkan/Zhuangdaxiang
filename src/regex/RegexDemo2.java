/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegexDemo2
 * Author:   Administrator
 * Date:     2019-3-21 21:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package regex;

public class RegexDemo2 {
    public static void main(String[] args){
        method2();
    }
    public static void method(){
        String email = "abc123@sina.com.cn";
      boolean b = email.matches("[a-zA-z_0-9]+@[0-9a-z]+(\\.[a-z]+)+");
       // boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);

    }
    public static void method2(){
        String str = "jk__sen_fsn_dfas";
        boolean c = str.matches("([a-z]+_+)+[a-z]+");
        System.out.println(c);
    }
}