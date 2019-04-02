package thread.deadlock;

/**创建线程，模拟死锁
 * @author: lrk
 * 2019/4/2 15:48
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock lock = new DeadLock();
        Thread t1 = new Thread(lock);
        Thread t2 = new Thread(lock);
        t1.start();
        t2.start();

    }

}
