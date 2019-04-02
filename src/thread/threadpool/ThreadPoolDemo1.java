package thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Use threadpool to create threads
 *
 * @author: lrk
 * 2019/4/2 10:42
 */
public class ThreadPoolDemo1  {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new PoolRunnable());
     
    }

}
