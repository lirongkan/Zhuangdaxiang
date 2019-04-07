package jdbcdemo.jdbcdomain;

import jdbcdemo.JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DBC读取数据表sort,每行数据封装到Sort类的对象中
 * 很多个Sort类对象,存储到List集合中
 *
 * @author: lrk
 * 2019/4/4 11:26
 */

public class JDBCUtilsDomain {
    public static void main(String[] args) throws Exception {
        //使用JDBC工具类,直接获取数据库连接对象

        //连接获取数据库SQL语句执行者对象
        //调用查询方法,获取结果集
        //创建集合对象
        /*创建List集合存储Sort对象*/
        Connection conn = JDBCUtils.getConnection();
        String sql = "SELECT * FROM sort";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        List<Sort> list = new ArrayList<>();
        while(rs.next()){
            Sort s = new Sort(rs.getInt("sid"),rs.getString("sname"),
                    rs.getDouble("sprice"),rs.getString("sdesc"));
            list.add(s);
        }
        for(Sort t: list){
            System.out.println(t);
        }
    }
}