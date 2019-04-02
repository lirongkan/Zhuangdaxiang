package thread.waitandnotify;

/**
 * Put data in
 *
 * @author: lrk
 * 2019/4/2 16:26
 */
public class Input implements Runnable{
    private Resource r ;
    /* 构造方法不能有返回值 */
    public  Input(Resource r){
        this.r = r;
    }
    @Override
    public void run(){
        int a =0;
        while(true){
            synchronized (r) {
                if(r.flag){
                   try{ r.wait();}catch(Exception ex){}
                }
                if (a % 2 == 0) {
                    r.name = "张三";
                    r.sex = "男";
                } else {
                    r.name = "lisi";
                    r.sex = "nv";

                }

                r.flag =true;
                r.notify();
            }
            a++;
        }

    }


}
