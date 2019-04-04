package jdbcdemo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: lrk
 * 2019/4/4 9:29
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/mybase";
        String user = "root";
        String password = "root";
        Connection conn =  DriverManager.getConnection(url ,user,password);
        String sql = "UPDATE  sort SET sdesc =? ,sname = ? WHERE sid = ?";
        PreparedStatement pst =  conn.prepareStatement(sql);
        pst.setObject(1,"Legendary");
        pst.setObject(2,"Railgun");
        pst.setObject(3,1);
        pst.executeUpdate();
       /* ResultSet rs =  pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("sid")+"---"+rs.getString("sname"));
        }*/

        pst.close();
        conn.close();
    }

}
