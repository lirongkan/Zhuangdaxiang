package thread.deadlock;

/**
 * 提供唯一的锁LockA
 *
 * @author: lrk
 * 2019/4/2 15:42
 */
public class LockB {
    private LockB(){}
    public static final LockB lockb = new LockB();

}
