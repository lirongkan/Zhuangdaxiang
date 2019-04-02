package thread;

/**
 * subThread extends Thread
 *
 * @author: lrk
 * 2019/4/2 9:18
 */
public class MyThread extends Thread {
    public  MyThread(){
        super("001");
    }
    @Override
    public void run(){
        //当创建对象时，构造器随着对象的创建进入堆内存
        System.out.println(getName());
    }

}
