/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   Administrator
 * Date:     2019-3-29 9:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package file.fileinputstreamdemo;

public class Test {
    public static void main(String[] args){
        String str = "abcdefg";
        byte[] bytes= str.getBytes();
        for(byte b:bytes){
            System.out.print(b+ " ");
        }
        String str2 = new String(bytes,1,4);
        System.out.println(str2);
    }

}