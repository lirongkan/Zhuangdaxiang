/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileCopy_FourWays
 * Author:   Administrator
 * Date:     2019-3-29 14:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io;

import java.io.*;

public class FileCopy_FourWays {

/*
 *  文件复制方式,字节流,一共4个方式
 *  1. 字节流读写单个字节                  32433 毫秒
 *  2. 字节流读写字节数组                   54   毫秒  OK
 *  3. 字节流缓冲区流读写单个字节            355   毫秒
 *  4. 字节流缓冲区流读写字节数组            22    毫秒  OK
 */
    public static void main(String[] args)throws IOException {
        long s = System.currentTimeMillis();
        copy_1(new File("D:\\Chrome Download\\vc2012.zip"), new File("d:\\abc\\vc2012.zip"));
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
    /*
     * 方法,实现文件复制
     *  4. 字节流缓冲区流读写字节数组
     */
    public static void copy_4(File src,File desc)throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0 ;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
    /*
     * 方法,实现文件复制
     *  3. 字节流缓冲区流读写单个字节
     */
    public static void copy_3(File src,File desc)throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0 ;
        while((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }

    /*
     * 方法,实现文件复制
     *  2. 字节流读写字节数组
     */
    public static void copy_2(File src,File desc)throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0 ;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    /*
     * 方法,实现文件复制
     *  1. 字节流读写单个字节
     */
    public static void copy_1(File src,File desc)throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0 ;
        while((len = fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
