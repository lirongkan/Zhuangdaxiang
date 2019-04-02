package thread.threadpool;

/**
 * @author: lrk
 * 2019/4/2 10:43
 */
public class PoolRunnable implements  Runnable{
    @Override
    public void run() {
        for(int i = 0; i< 10;i++){
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}
