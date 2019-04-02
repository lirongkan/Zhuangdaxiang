package thread;

/**
 *
 *  *  使用匿名内部类,实现多线程程序
 *  *  前提: 继承或者接口实现
 *  *  new 父类或者接口(){
 *  *     重写抽象方法
 *  *  }
 *
 *
 * @author: lrk
 * 2019/4/2 10:17
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                System.out.println("!!!");
            }
        }.start();


        Runnable runn =  new Runnable(){
            @Override
            public void run(){
                System.out.println("@@@");

            }
        };
        new Thread(runn).start();



        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                         System.out.println("###");
                    }
                }


        ).start();
    }



}
