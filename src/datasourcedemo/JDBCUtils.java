package datasourcedemo;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * 使用DataSource接口的链接工具类
 *
 * @author: lrk
 * 2019/4/5 9:26
 */
public class JDBCUtils {
    /**
     * 创建DataSource接口的对象，
     * 配置代码写在static代码块中，
     * 方法返回一个DataSource对象
     */
    private static BasicDataSource datasource = new BasicDataSource();

    //静态代码块,对象BasicDataSource对象中的配置,自定义
     static{
         datasource.setDriverClassName("com.mysql.jdbc.Driver");
         datasource.setUrl("jdbc:mysql://localhost:3306/mybase");
         datasource.setUsername("root");
         datasource.setPassword("root");
         /*初始化连接数、最大连接数量、最大空闲数、最小空闲*/
         datasource.setInitialSize(10);
         datasource.setMaxActive(8);
         datasource.setMaxIdle(5);
         datasource.setMinIdle(1);
     }

     public static DataSource getDataSource(){
         return datasource;
     }

}
