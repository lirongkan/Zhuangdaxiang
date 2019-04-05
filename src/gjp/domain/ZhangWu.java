package gjp.domain;

/**
 * JavaBean
 *
 * @author: lrk
 * 2019/4/5 11:59
 */
public class ZhangWu {

    private int zwid;
    private String flname;
    private double money;
    private String zhanghu;
    private String createtime;
    private String description;

    public ZhangWu(){}

    public ZhangWu(int zwid, String flname, double money, String zhanghu, String createtime, String description) {
        this.zwid = zwid;
        this.flname = flname;
        this.money = money;
        this.zhanghu = zhanghu;
        this.createtime = createtime;
        this.description = description;
    }

    public int getZwid() {
        return zwid;
    }

    public void setZwid(int zwid) {
        this.zwid = zwid;
    }

    public String getFlname() {
        return flname;
    }

    public void setFlname(String flname) {
        this.flname = flname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getZhanghu() {
        return zhanghu;
    }

    public void setZhanghu(String zhanghu) {
        this.zhanghu = zhanghu;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ZhangWu{" +
                "zwid=" + zwid +
                ", flname='" + flname + '\'' +
                ", money=" + money +
                ", zhanghu='" + zhanghu + '\'' +
                ", createtime='" + createtime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
