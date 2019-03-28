/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileFilterDemo
 * Author:   Administrator
 * Date:     2019-3-28 11:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file;

import java.io.File;

public class FileFilterDemo {
    public static void main(String[] args){
        File file = new File("d:\\abc");
        File[] fileArr = file.listFiles(new MyFilter());
        for(File f: fileArr){
            System.out.println(f);
        }
    }

}