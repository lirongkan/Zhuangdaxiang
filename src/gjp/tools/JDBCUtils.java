package gjp.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * JDBCUtils 工具类
 *
 * @author: lrk
 * 2019/4/5 12:12
 */
public class JDBCUtils {
    private static BasicDataSource datasource = new BasicDataSource();


    static{
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
        datasource.setUsername("root");
        datasource.setPassword("root");
        datasource.setMaxActive(10);
        datasource.setMaxIdle(5);
        datasource.setMinIdle(2);
        datasource.setInitialSize(10);
    }
    public static DataSource getDataSource(){
        return datasource;
    }

}
