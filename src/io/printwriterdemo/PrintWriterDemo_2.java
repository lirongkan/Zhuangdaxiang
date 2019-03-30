/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PrintWriterDemo_2
 * Author:   Administrator
 * Date:     2019-3-30 9:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.printwriterdemo;

import java.io.*;
/*
 * 打印流实现文本复制
 *   读取数据源  BufferedReader+File 读取文本行
 *   写入数据目的 PrintWriter+println 自动刷新
 */

public class PrintWriterDemo_2 {

        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new FileReader("c:\\a.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("d:\\a.txt"),true);
            String line = null;
            while((line = bfr.readLine())!=null){
                pw.println(line);
            }
            pw.close();
            bfr.close();
        }
    }