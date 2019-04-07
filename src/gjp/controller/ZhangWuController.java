package gjp.controller;
import gjp.domain.ZhangWu;
import gjp.service.ZhangWuService;

import java.util.List;

/**
 * 创建Service对象
 *
 * @author: lrk
 * 2019/4/5 12:30
 */
public class ZhangWuController {
    private ZhangWuService service = new ZhangWuService();

    /* 定义方法,实现条件查询账务
	 方法由试图层调用,传递两个日期的字符串
	 调用service层的方法,传递两个日期字符串,获取结果集
	 结果集返回给试图*/
    public List<ZhangWu> select(String startDate,String endDate){
        return service.select(startDate,endDate);
    }

    public List<ZhangWu> selectAll(){
        return service.selectAll();
    }

    public void addZhangWu(ZhangWu zw){
        service.addZhangWu(zw);
    }
    public void editZhangWu(ZhangWu zw){
        service.editZhangWu(zw);
    }
    public void deleteZhangWu(int zwid){
        service.deleteZhangWu(zwid);
    }

}
