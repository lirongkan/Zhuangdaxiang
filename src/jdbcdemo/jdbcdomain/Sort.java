package jdbcdemo.jdbcdomain;

/**
 * A class to store table sort
 *
 * @author: lrk
 * 2019/4/4 11:18
 */
public class Sort {
    private int sid;
    private String sname;
    private  Double sprice;
    private String sdesc;
    public Sort(){}
    public Sort(int sid,String sname,Double sprice,String sdesc){
        this.sid=sid;
        this.sname=sname;
        this.sprice = sprice;
        this.sdesc=sdesc;

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

     public String getSdesc(){
            return sdesc;
     }

     public void setSdesc(String sdesc){
            this.sdesc=sdesc;
     }

    @Override
    public String toString() {
        return "Sort{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sprice=" + sprice +
                ", sdesc='" + sdesc + '\'' +
                '}';
    }
}
