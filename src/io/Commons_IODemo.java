package io;

import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class Commons_IODemo {
    public static void main(String[] args) {
        function();
    }
    /*
     * FilenameUtils类的方法
     * static boolean isExtension(String filename,String extension)
     * 判断文件名的后缀是不是extension
     */
    public static void function_2(){
       boolean b = FilenameUtils.isExtension("a.asas","asas");
        System.out.println(b);
    }

    /*
     * FilenameUtils类的方法
     * static String getName(String filename)
     * 获取文件名
     */
    public static void function_1(){
        String name = FilenameUtils.getName("d:\\abc\\aaa.txt6");
        System.out.println(name);//aaa.txt6
    }

    /*
     * FilenameUtils类的方法
     * static String getExtension(String filename)
     * 获取文件名的扩展名
     */
    public static void function(){
        File file = new File("d:\\abc\\aa.txt");
        boolean b =file.exists();
        //隐藏的只是自己看不到，编译器是根据全部文件明德，不管是否隐藏
        String name = FilenameUtils.getExtension("d:\\abc\\aa.txt");
        System.out.println(b + " " +name);
    }
}
