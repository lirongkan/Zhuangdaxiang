/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BufferedWriterDemo
 * Author:   Administrator
 * Date:     2019-3-29 15:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.bufferedwriter_reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException{


        /*
         *   字符输出流缓冲区流
         *     java.io.BufferedWriter 继承 Writer
         *     写入方法 write () 单个字符,字符数组,字符串
         *
         *     构造方法:
         *       BufferedWriter(Writer w)传递任意字符输出流
         *       传递谁,就高效谁
         *         能传递的字符输出流 FileWriter, OutputStreamWriter
         *
         *    BufferedWriter 具有自己特有的方法
         *      void  newLine() 写换行
         *
         *       newLine()文本中换行, \r\n也是文本换行
         *       方法具有平台无关性
         *       Windows  \r\n
         *       Linux    \n
         *
         *       newLine()运行结果,和操作系统是相互关系
         *       JVM: 安装的是Windows版本,newLine()写的就是\r\n
         *            安装的是Linux版本,newLine()写的就是\n
         */

                //创建字符输出流,封装文件
                FileWriter fw = new FileWriter("d:\\abc\\buffer.txt");
                BufferedWriter bfw = new BufferedWriter(fw);

                bfw.write("你好");
                bfw.newLine();
                bfw.flush();


                bfw.write("我好好");
                bfw.newLine();
                bfw.flush();

                bfw.write("大家都好");
                bfw.flush();

                bfw.close();

            }
        }

/*
 *
		bfw.write(100);
		bfw.flush();

		bfw.write("你好".toCharArray());
		bfw.flush();*/
