package thread.threaddemo2;

/**
 * security
 *
 * @author: lrk
 * 2019/4/2 11:41
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        /*
         *  采用同步方法形式,解决线程的安全问题
         *  好处: 代码简洁
         *  将线程共享数据,和同步,抽取到一个方法中
         *  在方法的声明上,加入同步关键字
         *
         *  问题:
         *    同步方法有锁吗,肯定有,同步方法中的对象锁,是本类对象引用 this
         *    如果方法是静态的呢,同步有锁吗,绝对不是this
         *    锁是本类自己.class 属性
         *    静态方法,同步锁,是本类类名.class属性
         */
    Runnable t = new Tickets();
    Thread t0 = new Thread(t);
    Thread t1 = new Thread(t);
    Thread t2 = new Thread(t);
    t0.start();
    t1.start();
    t2.start();


    }

}
