package thread.deadlock;

/**
 * 提供唯一的锁LockA
 *
 * @author: lrk
 * 2019/4/2 15:42
 */
public class LockA {
    private LockA(){}
    public static final LockA locka = new LockA();

}
