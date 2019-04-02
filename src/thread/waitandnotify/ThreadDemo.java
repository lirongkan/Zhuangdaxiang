package thread.waitandnotify;

/**
 * test
 *
 * @author: lrk
 * 2019/4/2 16:33
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Output out = new Output(r);
        Input in = new Input(r);

        Thread tin = new Thread(in);
        Thread tout = new Thread(out);
        tin.start();
        tout.start();

    }

}
