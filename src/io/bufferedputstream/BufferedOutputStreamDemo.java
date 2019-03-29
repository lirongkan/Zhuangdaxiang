/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BufferedOutputStreamDemo
 * Author:   Administrator
 * Date:     2019-3-29 15:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.bufferedputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new
                BufferedOutputStream(new FileOutputStream("d:\\abc\\buffered_1.txt"));
                bos.write(55);
                byte[] bytes = "HelloWorld".getBytes();
                bos.write("HelloWorld".getBytes());
                bos.write(bytes,2,4);

                bos.flush();
    }

}