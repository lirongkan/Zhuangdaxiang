package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 注入攻击
 *
 * @author: lrk
 * 2019/4/3 22:30
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase";
        String user = "root";
        String password = "root";
        Connection conn =  DriverManager.getConnection(url,user,password);
        Statement stat =  conn.createStatement();

        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String p = sc.nextLine();
        String sql = "SELECT * FROM users WHERE userName='"+ u+"' AND pwd='"+p+" '";
        System.out.println(sql);
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            System.out.println
                    (rs.getString("userName")+ " "+rs.getString("pwd"));



        }
        rs.close();
        stat.close();
        conn.close();


    }

}
