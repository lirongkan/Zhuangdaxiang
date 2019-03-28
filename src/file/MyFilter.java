/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyFilter
 * Author:   Administrator
 * Date:     2019-3-28 11:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MyFilter implements FileFilter {//FilenameFilter
    public boolean accept(File pathname){//String name
        if(pathname.isDirectory())
            return true;
       String name = pathname.getName();

        return name.toLowerCase().endsWith(".txt");

    }

}