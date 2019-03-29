/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ObjectOutputStreamDemo
 * Author:   Administrator
 * Date:     2019-3-29 23:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.objectoutputstream;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
		writeObject();
       readObject();
    }
    /*
     * ObjectInputStream
     * 构造方法:ObjectInputStream(InputStream in)
     * 传递任意的字节输入流,输入流封装文件,必须是序列化的文件
     * Object readObject()  读取对象
     */
    public static void readObject() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("d:\\person.txt");
        //创建反序列化流,构造方法中,传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //调用反序列化流的方法 readObject()读取对象
        Object obj =ois.readObject();
        System.out.println(obj);
        ois.close();
    }

    /*
     * ObjectOutputStream
     * 构造方法: ObjectOutputStream(OutputSteam out)
     * 传递任意的字节输出流
     * void writeObject(Object obj)写出对象的方法
     */
    public static void writeObject() throws IOException {
        //创建字节输出流,封装文件
        FileOutputStream fos = new FileOutputStream("d:\\person.txt");
        //创建写出对象的序列化流的对象,构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person("lisi",25);
        //调用序列化流的方法writeObject,写出对象
        oos.writeObject(p);
        oos.close();
    }
}