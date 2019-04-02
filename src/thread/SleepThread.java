package thread;

/**
 * sleep
 *
 * @author: lrk
 * 2019/4/2 9:50
 */
public class SleepThread extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);

            } catch (Exception ex) {

            }
            System.out.println(i);
        }

    }
}
