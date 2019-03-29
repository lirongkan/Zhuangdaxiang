/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CopyDemo
 * Author:   Administrator
 * Date:     2019-3-28 20:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file.fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args){
        FileInputStream fis= null;
        FileOutputStream fos = null;
        long s = System.currentTimeMillis();
        try {
            fis = new FileInputStream("d:\\abc\\a\\Copy.java");
            fos = new FileOutputStream("d:\\abc\\b\\Copy.java");
            int len =0;
            byte[] bytes = new byte[1024];
            while((len = fis.read()) != -1){
                //定义字节数组做缓冲区
                fos.write(bytes,0,len);
//                fos.write(len);
            }
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException();
        }finally{
            try {
                if (fos != null)
                    fos.close();
            }catch(IOException ex){
                throw new RuntimeException();
            }finally{
                try{
                    if(fis != null)
                        fis.close();
                }catch (IOException ex){
                    throw new RuntimeException();
                }
            }
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);

    }


}