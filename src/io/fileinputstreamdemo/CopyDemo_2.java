/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CopyDemo_2
 * Author:   Administrator
 * Date:     2019-3-29 10:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.fileinputstreamdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyDemo_2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
       // File parent  = null;
        String str= null;

        try {
            str = new Scanner(System.in).next();
            //注意源文件编码和IDEA编码一致，UTF-8
           // parent =new File("d:\\abc\\a");
            fr = new FileReader(str);
            fw = new FileWriter("d:\\abc\\b\\Copy_2.java");
            char[] c = new char[1024];
            int len = 0;
            while ((len = fr.read(c)) != -1) {
                fw.write(c,0,len);
                fw.flush();

            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException();

        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                throw new RuntimeException();
            } finally {
                try {
                    if (fw != null)
                        fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException();
                }
            }
        }
    }
}