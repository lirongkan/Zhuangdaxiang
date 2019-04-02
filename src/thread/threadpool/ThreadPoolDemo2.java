package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Use interface Callable<> to create threadpool
 *
 * @author: lrk
 * 2019/4/2 11:05
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception {
       ExecutorService es =    Executors.newFixedThreadPool(2);
        Future<Integer> f=  ((ExecutorService) es).submit(new PoolCallable(100));
        Future<Integer> f2 = ((ExecutorService) es).submit(new PoolCallable(200));
        System.out.println(f.get());
        System.out.println(f2.get());


    }

}
