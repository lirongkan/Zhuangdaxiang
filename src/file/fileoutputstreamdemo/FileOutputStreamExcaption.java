/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileOutputStreamExcaption
 * Author:   Administrator
 * Date:     2019-3-28 14:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file.fileoutputstreamdemo;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
    //IO流的异常处理  try catch finally
public class FileOutputStreamExcaption {
    public static void main(String[] args) {
        /**
         * 功能描述:
         * 1. 保证流对象变量,作用域足够
         * 2. catch里面,怎么处理异常;输出异常的信息,目的看到哪里出现了问题;停下程序,从新尝试
         * 3. 如果流对象建立失败了,需要关闭资源吗;new 对象的时候,失败了,没有占用系统资源
         *      释放资源的时候,对流对象判断null;变量不是null,对象建立成功,需要关闭资源
         * @param:[args]
         * @return:void
         * @Date: 2019-3-28 15:07
         */

        FileOutputStream fos =null;
        try {

            fos = new FileOutputStream("d:\\abc\\a.txt");
            fos.write(1);
        }catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("输入失败，请重试！");

        }finally {
            try {
                if(fos != null)
                fos.close();

            }catch (IOException ex){
                throw new RuntimeException("关闭资源失败，请重试！");

            }
        }
    }
}
