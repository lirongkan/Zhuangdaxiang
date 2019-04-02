package thread;

/**
 * A demo to show how to create thread
 *
 * @author: lrk
 * 2019/4/2 9:17
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
          @Description:继承Thread类，重写run方法，子类对象调用start方法
         *
         * @params:[args]
         * @return:void
         */

        MyThread mt = new MyThread();

        /*
        自己的电脑CPU比较好，循环太少看不出来乱序执行
         */
        mt.setName("002");
        mt.run();
        String str = Thread.currentThread().getName();
        System.out.println(str);
    }

}
