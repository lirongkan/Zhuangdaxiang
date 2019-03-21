/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringTest
 * Author:   Administrator
 * Date:     2019-3-21 15:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringTest {
    public static void main(String[] args){
       getCount("jhfsjfUJ@OIPUzsdfjs");
        System.out.println(toConvert("KSJFLKSJFsfs"));
       System.out.println(getStringCount("SJFSJFPOIjksdfipisfwerwrwerdf","we"));
    }

   public static String toConvert(String str){
        String first =str.substring(0,1);
        String second = str.substring(1);
        //调用String类方法
       first = first.toLowerCase();
       second = second.toUpperCase();
       return first + second;
   }

   public static void getCount(String str){
        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        for(int i =0;i < str.length();i++){
           char  a = str.charAt(i);
           if(a>=48 && a <=57){
               shuzi++;
           }else if(a >=97&& a<=122){
               xiaoxie++;
           }else if (a>=65 &&a<=90){
               daxie++;
           }

           }
        System.out.println(daxie +" "+shuzi +" "+xiaoxie);
    }

    public static int getStringCount(String str,String key){

        int count =0;
        int index = 0;

        while((index = str.indexOf(key) )!= -1){
            count++;
            str = str.substring((index+key.length()));
        }
        return count;
    }
}
