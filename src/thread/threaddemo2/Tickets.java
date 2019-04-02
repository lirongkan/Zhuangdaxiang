package thread.threaddemo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * A class implements Runnable which moni sale tickets
 *
 * @author: lrk
 * 2019/4/2 11:43
 */
public class Tickets implements  Runnable{

    private  int ticket = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){

            getTicket();
        }
    }
    public   void getTicket(){
        lock.lock();

            if (ticket > 0) {
                try {
                    sleep(100);
                System.out.println(Thread.currentThread().getName() + " 售出" + ticket--);
                } catch (Exception ex) {}
                finally{
                    lock.unlock();
                }

        }
    }
}
    /*private int ticket =100 ;
    Object obj = new Object();
    @Override
    public void run(){
        while(true){
            synchronized (obj){
                    if(ticket >0) {
                    try {
                        Thread.sleep(50);
                    } catch (Exception ex) {
                    }
                    System.out.println(Thread.currentThread().getName() + "以售票" + ticket--);
            }

            }
        }
    }

*/
