package thread.waitandnotify;

/**
 * Print name and sex
 *
 * @author: lrk
 * 2019/4/2 16:31
 */
public class Output implements  Runnable{
    private Resource r ;
    public  Output(Resource r){
        this.r = r;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (r) {
                if(!r.flag){
                    try{r.wait();}catch (Exception ex){}
                }
                System.out.println(r.name + "..." + r.sex);

            r.flag =false;
            r.notify();
            }

        }
    }
}
