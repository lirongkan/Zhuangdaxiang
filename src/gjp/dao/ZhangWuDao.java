package gjp.dao;

import gjp.domain.ZhangWu;
import gjp.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 创建QueryRunner对象
 *
 * @author: lrk
 * 2019/4/5 12:24
 */
public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());



    public List<ZhangWu> selectAll(){
        try {
            String sql = "SELECT * FROM gjp_zhangwu";
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
            return list;
        }catch(SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("查询所有数据失败！");

        }
    }

    public List<ZhangWu> select(String startDate, String endDate){
        try {
            String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
            Object[] param = {startDate, endDate};
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class),param);
            return list;
        }catch(Exception ex){
            System.out.println(ex);
            throw new RuntimeException("条件查询失败！");

        }
    }
    public void addZhangWu(ZhangWu zw){
        try {
            String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description) VALUES(?,?,?,?,?)";
            Object[] param = {zw.getFlname(), zw.getMoney(),
                    zw.getZhanghu(), zw.getCreatetime(), zw.getDescription()};
            qr.update(sql, param);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("添加账务失败！");
        }
    }
    public void editZhangWu(ZhangWu zw){
        try {
            String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
            Object[] param = {zw.getFlname(), zw.getMoney(),
                    zw.getZhanghu(), zw.getCreatetime(), zw.getDescription(),zw.getZwid()};
            qr.update(sql, param);
        }catch(SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("编辑事物失败！");
        }
    }
    public void deleteZhangWu(int zwid){
        try {
            String sql = "DELETE FROM gjp_zhangwu WHERE zwid = ?";
            qr.update(sql, zwid);
        }catch(SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("删除事物失败！");

        }
    }
}
