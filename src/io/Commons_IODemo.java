/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Commons_IODemo
 * Author:   Administrator
 * Date:     2019-3-30 0:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io;

import org.apache.commons.io.FilenameUtils;

public class Commons_IODemo {
    public static void main(String[] args) {
        function_1();
    }
    /*
     * FilenameUtils类的方法
     * static boolean isExtension(String filename,String extension)
     * 判断文件名的后缀是不是extension
     */
    public static void function_2(){
        boolean b = FilenameUtils.isExtension("Demo.java", "java");
        System.out.println(b);
    }

    /*
     * FilenameUtils类的方法
     * static String getName(String filename)
     * 获取文件名
     */
    public static void function_1(){
        String name = FilenameUtils.getName("c:\\windows\\aaa.txt6");
        System.out.println(name);
    }

    /*
     * FilenameUtils类的方法
     * static String getExtension(String filename)
     * 获取文件名的扩展名
     */
    public static void function(){
        String name = FilenameUtils.getExtension("c:\\windows");
        System.out.println(name);
    }
}
