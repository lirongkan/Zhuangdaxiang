/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileDemo
 * Author:   Administrator
 * Date:     2019-3-28 8:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file;

import javax.swing.text.PasswordView;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        function_10();
    }

    public static void function_1() {
        String separator = File.pathSeparator;
        String separator2 = File.separator;
        System.out.println(separator + " " + separator2);

    }

    public static void function_2() {
        File file = new File("d:\\giT\\LICENSE.t1xt");
        System.out.println(file);
        boolean b = file.exists();
        System.out.println(b);

    }

    public static void function_3() {
        File file = new File("d:\\git", "license.txt");
        System.out.println(file);

    }

    public static void function_4() throws IOException {
        File file = new File("d:\\a.txt");
        boolean b = file.createNewFile();
        System.out.println(b);
        System.out.println(file.exists());
        System.out.println(file.length());//多少字节
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

    }

    public static void function_5() {
        File file = new File("d:\\abc\\a.txt");
        boolean b = file.mkdir();
        boolean c = file.mkdirs();
        System.out.println(b + " " + c);

    }

    public static void function_6() {
        File file = new File("d:\\abc");
        boolean b = file.delete();
        System.out.println(b);

    }

    public static void function_7() {
        File file = new File("abc");//若为相对路径，则绝对路径为工作根目录
        File abs = file.getAbsoluteFile();
        String abs1 = file.getAbsolutePath();
        System.out.println(abs);
        System.out.println(abs1);//一般采用File类型方法


    }

    public static void function_8() {
        File file = new File("d:\\git\\LICENSE.txt");
        File parent = file.getParentFile().getParentFile().getParentFile();//盘符已经是最顶层的目录
        System.out.println(parent);

    }

    public static void function_9() {
        File file = new File("d:\\");
        String[] listArr = file.list();
        System.out.println(listArr.length);
        //显示所有的文件，包括隐藏的和受保护的
        for (String str : listArr) {
            System.out.println(str);

        }
    }

    public static void function_10() {
        File file = new File("d:\\git");
        File[] listArr = file.listFiles();
        for(File list:listArr){
            System.out.println(list);
        }

    }
}
