/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BufferedInputStreamDemo
 * Author:   Administrator
 * Date:     2019-3-29 15:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.bufferedputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new
                BufferedInputStream(new FileInputStream("d:\\abc\\buffer.txt") );
        int len =0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1 ){
            System.out.println(new String(bytes,0,len));


        }
        bis.close();
    }

}