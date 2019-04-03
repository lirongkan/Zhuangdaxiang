package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * PrepareStatment 防止注入攻击
 *
 * @author: lrk
 * 2019/4/3 23:21
 */
public class JDBCDemo3 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/mybase";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,user,password);
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String p = sc.nextLine();
        String sql ="SELECT * FROM users WHERE userName = ? AND pwd =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        //System.out.println(pst);
        pst.setObject(1,u);
        pst.setObject(2,p);

        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getObject("userName") +" "+rs.getObject("pwd"));
        }
        rs.close();
        pst.close();
        conn.close();



    }

}
