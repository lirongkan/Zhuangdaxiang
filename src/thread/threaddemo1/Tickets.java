package thread.threaddemo1;

import static java.lang.Thread.sleep;

/**
 * A class implements Runnable which moni sale tickets
 *
 * @author: lrk
 * 2019/4/2 11:43
 */
public class Tickets implements  Runnable{

    private static int ticket = 100;

    @Override
    public void run() {
        while(true){

            getTicket();
        }
    }
    public  static void getTicket(){
        synchronized (Tickets.class) {
            if (ticket > 0) {
                try {
                    sleep(100);
                } catch (Exception ex) {
                }
                System.out.println(Thread.currentThread().getName() + " 售出" + ticket--);
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
