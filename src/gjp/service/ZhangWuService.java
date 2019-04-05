package gjp.service;

import gjp.dao.ZhangWuDao;
import gjp.domain.ZhangWu;

import java.util.List;

/**
 * 调用Dao包中的方法
 *
 * @author: lrk
 * 2019/4/5 12:27
 */
public class ZhangWuService {
    private  ZhangWuDao dao =new ZhangWuDao();

    /*
     * 定义方法,实现条件查询账务
     * 方法由控制层调用,传递2个日期字符串
     * 调用dao层的方法,传递2个日期字符串
     * 获取到查询结果集
     */
    public List<ZhangWu> select(String startDate,String endDate){
        return dao.select(startDate,endDate);
    }
    public List<ZhangWu> selectAll(){
        /*List<ZhangWu> list = dao.selectAll();
        return list;*/
        return dao.selectAll();
    }

    public void addZhangWu(ZhangWu zw){
        dao.addZhangWu(zw);
    }
    public void editZhangWu(ZhangWu zw){
        dao.editZhangWu(zw);
    }
    public void deleteZhangWu(int zwid){
        dao.deleteZhangWu(zwid);

    }
}
