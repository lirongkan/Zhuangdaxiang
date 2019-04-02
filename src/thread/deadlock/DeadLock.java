package thread.deadlock;

/**
 * A class implements Runnable
 *
 * @author: lrk
 * 2019/4/2 15:44
 */
public class DeadLock implements Runnable{
    private int a = 0;
    @Override
    public void run() {
        while(true) {
            if (a % 2 == 0) {
                synchronized (LockA.locka){
                    System.out.println("if---locka");
                    synchronized (LockB.lockb){
                        System.out.println("if---lockb");
                    }
                }
            }else{
                synchronized (LockB.lockb){
                    System.out.println("else---lockb");
                    synchronized (LockA.locka){
                        System.out.println("else---locka");
                    }
                }
            }
            a++;
        }

    }
}
