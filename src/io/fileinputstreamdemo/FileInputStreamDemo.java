/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileInputStreamDemo
 * Author:   Administrator
 * Date:     2019-3-28 19:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\abc\\a.txt");
        /*int i =fis.read();
        System.out.println(i);
        int j =fis.read();
        System.out.println(j);
        fis.close();*/ //当read()返回值为-1时，说明已经读到尾部。
       /* byte[] b = new byte[2];
        int len = fis.read(b);
        System.out.println(new String(b));
        System.out.println(len);*/

        byte[] b = new byte[1024];

        int len = 0 ;
        while( (len = fis.read(b)) !=-1){
            System.out.print(new String(b,0,len));
        }
        fis.close();
    }

}
/*
 *
		int len = fis.read(b);
		System.out.println(new String(b));//ab
		System.out.println(len);//2

		len = fis.read(b);
		System.out.println(new String(b));//cd
		System.out.println(len);//2

		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//1

		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//-1
		*/