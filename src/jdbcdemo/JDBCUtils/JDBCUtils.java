package jdbcdemo.JDBCUtils;

import java.sql.*;

/**
 * Test
 *
 * @author: lrk
 * 2019/4/4 9:58
 */
public class JDBCUtils {
    private static Connection conn;
    private JDBCUtils(){}

   static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybase";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception ex){
            throw new RuntimeException(ex +"Connection Failed!");
        }
   }

    public static Connection getConnection() {
        return conn;
    }
    public static void close(Connection conn, Statement stat, ResultSet rs){
        if(conn != null){
            try{
            conn.close();
            }catch(SQLException ex){}
        }

        if(stat != null){
            try{
                stat.close();
            }catch(SQLException ex){}
        }

        if(rs != null){
            try{
                rs.close();
            }catch(SQLException ex){}
        }
    }

    public static void close(Connection conn, Statement stat){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException ex){}
        }

        if(stat != null){
            try{
                stat.close();
            }catch(SQLException ex){}
        }

    }


}
