/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringTest
 * Author:   Administrator
 * Date:     2019-3-21 15:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stringdemo;

public class StringTest {
    public static void main(String[] args) {
        getCount("jhfsjfUJ@OIP234Uzsdfjs");
        System.out.println(toConvert("KSJFLKSJFsfs"));
        System.out.println(getStringCount("SJFSweweJFPOIwwefweweewjksdfipisfwewfewewfewerwrfrdf", "we"));
    }

    public static String toConvert(String str) {
        String sub1 = str.substring(0, 1);
        String sub2 = str.substring(1);
        sub1 = sub1.toUpperCase();
        sub2 = sub2.toLowerCase();
        return sub1 + sub2;

    }

    public static void getCount(String str) {
        int upletter = 0;
        int lowletter = 0;
        int num = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char a = ch[i];
            if (a > 'a' && a < 122)
                lowletter++;
            if (a > 'A' && a < 'Z')
                upletter++;
            if (a > 48 && a < 57)
                num++;
        }
        System.out.println(upletter + " " + lowletter + " " + num);
    }


    public static int getStringCount(String str, String key) {
        int index ;
        int count = 0;
        while((index =str.indexOf(key)) != -1){
            count++;
            str = str.substring(index + key.length());

        }

       return count;
    }
}