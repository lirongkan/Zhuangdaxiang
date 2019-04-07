package jdbcdemo.JDBCUtils;

import jdbcdemo.jdbcproperties.JDBCUtilsConfig;

import java.sql.Connection;

/**
 * @author: lrk
 * 2019/4/4 18:17
 */
public class Test {
    public static void main(String[] args) {

        Connection conn = JDBCUtilsConfig.getConnection();
        System.out.println(conn);
    }

}
