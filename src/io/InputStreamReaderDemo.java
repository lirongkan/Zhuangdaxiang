/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: InputStreamdemo
 * Author:   Administrator
 * Date:     2019-3-29 13:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\abc\\gbk.txt");
        //若用字符流，可能编码表不一致导致乱码现象
        //FileReader fr = new FileReader("d:\\abc\\demo.java");
        //若不做转换，字节流不能将字符变为字节；read(char[]) --> read(byte[])不适用
        InputStreamReader fsr = new InputStreamReader(fis,"UTF-8");

        int len =0;
        char[] c = new char[1024];
        while ((len = fsr.read(c) ) != -1){
            System.out.println(new String(c,0,len));
        }
        //writeGBK();
    }
    /*
     * 转换流对象 OutputStreamWriter写文本
     * 文本采用GBK的形式写入
     */
    public static void writeGBK()throws IOException{
        //创建字节输出流，绑定数据文件
        FileOutputStream fos = new FileOutputStream("d:\\abc\\utf.txt");
        //创建转换流对象，构造方法，绑定字节输出流，使用GBK编码表
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //转换流写数据
        osw.write("你好");

        osw.close();
    }

}