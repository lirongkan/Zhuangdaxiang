package io.printwriterdemo;

/**
 * This class show you how to write javadoc and slowdown warnings
 *
 * @author lrk
 * 2019-3-30 10:38
 */
public class Demo {
    public static void main(String[] args) {
        /*
         * String s = "abc";final char[] value
         */
        int[] arr = {1};
        System.out.println(arr);//调用toString()方法

        char[] ch = {'a','b'};
        System.out.println(ch);

        byte[] b = {};
        System.out.println(b);
    }
}
