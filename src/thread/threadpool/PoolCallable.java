package thread.threadpool;

import java.util.concurrent.Callable;

/**
 * Use Callable<>to create
 *
 * @author: lrk
 * 2019/4/2 11:03
 */
public class PoolCallable implements Callable<Integer> {
    private int a;
    public PoolCallable(int a){
        this.a =a;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i =1;i<= a;i++){
            sum += i;
        }
        return sum;
    }
}
