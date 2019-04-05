package datasourcedemo;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: lrk
 * 2019/4/4 23:45
 */
public class DataSourceDemo {
    public static void main(String[] args) {
        //创建DataSource接口的实现类对象
        //实现类, org.apache.commons.dbcp
        BasicDataSource dataSource = new BasicDataSource();
        //连接数据库的4个最基本信息,通过对象方法setXXX设置进来
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        try{
            //调用对象方法getConnection获取数据库的连接
         Connection con = dataSource.getConnection();
            System.out.println(con);
        }catch(SQLException ex){
		System.out.println(ex);
            throw new RuntimeException("数据库连接失败");
        }
    }

}


/*
* -- count 求和,对表中的数据的个数求和  count(列名)
-- 查询统计账务表中,一共有多少条数据
SELECT COUNT(*)AS'count' FROM zhangwu
* */
