package jdbcdemo.jdbcproperties;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author: lrk
 * 2019/4/4 12:40
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Connection con = JDBCUtilsConfig.getConnection();
        InputStream in = Test.class.getClassLoader().getResourceAsStream("database.properties");
        System.out.println(con);
        Properties pro = new Properties();
        pro.load(in);
        System.out.println(pro);
    }

}
