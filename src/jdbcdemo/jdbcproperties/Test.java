package jdbcdemo.jdbcproperties;

import java.sql.Connection;


/**
 * @author: lrk
 * 2019/4/4 12:40
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Connection con = JDBCUtilsConfig.getConnection();
        System.out.println(con);
    }

}
