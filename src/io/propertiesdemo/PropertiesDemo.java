/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PropertiesDemo
 * Author:   Administrator
 * Date:     2019-3-29 17:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package io.propertiesdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        load();

    }

    public static void load() throws IOException {
        //无序集
        Properties pro = new Properties();
        FileReader fr = new FileReader("d:\\abc\\a.txt");
        pro.load(fr);
        fr.close();
        System.out.println(pro);


    }

    public static void store() throws IOException {
        Properties pro = new Properties();
        FileWriter fw = new FileWriter("d:\\abc\\a.txt");
        pro.setProperty("A","1");
        pro.store(fw,"");
        System.out.println(pro);
        fw.close();
    }
}

