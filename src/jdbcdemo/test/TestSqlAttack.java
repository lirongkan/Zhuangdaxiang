package jdbcdemo.test;

import java.sql.*;
import java.util.Scanner;

/**
 * Sql attack
 *
 * @author: lrk
 * 2019/4/4 9:07
 */
public class TestSqlAttack {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,user,password);
/*
        Statement stat =  conn.createStatement();
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String p = sc.nextLine();

        String sql = "SELECT * FROM users WHERE userName = '"+ u+"' AND pwd = '"+ p+ "'";
*/
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String p = sc.nextLine();
        String sql = "SELECT * FROM users WHERE userName = ? AND pwd = ?";
        PreparedStatement pst =   conn.prepareStatement(sql);
        pst.setObject(1,u);
        pst.setObject(2,p);
        System.out.println(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("userName")+"---"+rs.getString("pwd"));
        }

        rs.close();
        pst.close();
        conn.close();
    }

}
