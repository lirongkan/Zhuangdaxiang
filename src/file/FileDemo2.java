/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileDemo2
 * Author:   Administrator
 * Date:     2019-3-28 11:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args){
        File file = new File("d:\\abc");
        getAllDir(file);
    }
    public static void getAllDir(File dir){
        File[] dirArr = dir.listFiles(new MyFilter());
        for(File f: dirArr){
            if(f.isDirectory()){
                getAllDir(f);
            }else
            System.out.println(f);

        }

    }
}

