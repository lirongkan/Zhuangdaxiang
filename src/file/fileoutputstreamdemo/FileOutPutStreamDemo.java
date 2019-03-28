/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileOutPutStreamDemo
 * Author:   Administrator
 * Date:     2019-3-28 14:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file.fileoutputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {
    public static void main(String[] args) throws  IOException {
        File file = new File("d:\\abc\\b.txt");
        FileOutputStream fos = new FileOutputStream(file,true);

        fos.write("Hello".getBytes());
        fos.write("\r\nWorld".getBytes());
        fos.close();
    }

}