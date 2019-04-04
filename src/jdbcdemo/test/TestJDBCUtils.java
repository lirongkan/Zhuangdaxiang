package jdbcdemo.test;

import jdbcdemo.JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Test JDBCUtils
 *
 * @author: lrk
 * 2019/4/4 10:07
 */
public class TestJDBCUtils {
    public static void main(String[] args) throws SQLException {
        Connection conn =JDBCUtils.getConnection();
        String sql = "SELECT * FROM sort ";
        PreparedStatement pst =  conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("sid")+"---"+rs.getString("sdesc"));
        }
       JDBCUtils.close(conn,pst,rs);
    }

}
