/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test_2
 * Author:   Administrator
 * Date:     2019-3-29 10:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file.fileinputstreamdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_2 {


/*
 *  字符流复制文本文件,必须文本文件
 *  字符流查询本机默认的编码表,简体中文GBK
 *  FileReader读取数据源
 *  FileWriter写入到数据目的
 */

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("d:\\abc\\a.txt");
            fw = new FileWriter("d:\\abc\\a1.txt");
            char[] cbuf = new char[1024];
            int len = 0 ;
            while(( len = fr.read(cbuf))!=-1){
                fw.write(cbuf, 0, len);
                fw.flush();
            }

        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        }finally{
            try{
                if(fw!=null)
                    fw.close();
            }catch(IOException ex){
                throw new RuntimeException("释放资源失败");
            }finally{
                try{
                    if(fr!=null)
                        fr.close();
                }catch(IOException ex){
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
