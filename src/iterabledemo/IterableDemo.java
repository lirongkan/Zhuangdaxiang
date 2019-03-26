/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IterableDemo
 * Author:   Administrator
 * Date:     2019-3-25 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package iterabledemo;

import yuangong.*;


import java.util.ArrayList;

public class IterableDemo {
    public static void main(String[] args){
        function_3();
    }

    public static void function(){
        int[] arr ={123,12,12234,234,123,123123};
        for(int i:arr){
            System.out.println(i+1);
        }
        System.out.println(arr[0]);//123
    }

    public static void function_2(){
        String[] str ={"123d","12werw3d","1sdf23d","12sf3d"};
        for(String s:str){
            System.out.println(s+" "+s.length());
        }
    }
    public static void function_3(){
        ArrayList<Person> array = new ArrayList<Person>();
        array.add(new Person("A",20)  );
        array.add(new Person("B",29)  );
        for(Person p:array){
            System.out.println(p);
        }


    }
    public static void function_4(){
        ArrayList<ChuShi> c = new ArrayList<>();
        c.add(new ChuShi("A",20));
        c.add(new ChuShi("a",10));
        for(ChuShi cs:c){
            System.out.println(cs);//疑问


        }

    }

}