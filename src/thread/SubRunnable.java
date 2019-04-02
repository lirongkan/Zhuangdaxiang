package thread;

/**
 * A class implements Runnable
 *
 * @author: lrk
 * 2019/4/2 10:06
 */
public class SubRunnable implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i< 50;i++){
            try {
                Thread.sleep(1000);
            }catch(Exception ex){}
            System.out.println(i);
        }
    }

}
