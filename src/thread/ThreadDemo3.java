package thread;

/**
 * Inplements Runnable interface to create threads
 *
 * @author: lrk
 * 2019/4/2 10:05
 */
public class ThreadDemo3 {
    public static void main(String[] args) {

        SubRunnable sr = new SubRunnable();
        Thread t = new Thread(sr);
        t.start();
    }

}
