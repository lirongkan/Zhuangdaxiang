package jdbcdemo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * exercise myself
 *
 * @author: lrk
 * 2019/4/4 8:39
 */
public class TestInsert {
    public static void main(String[] args)  throws Exception{
        /*利用反射注册驱动*/
        Class.forName("com.mysql.jdbc.Driver");
        /*利用DriverManager静态方法获取链接对象
        * DriverManager.getConnedtion(url,user,password);
        * */
        String url= "jdbc:mysql://localhost:3306/mybase";
        String user = "root";
        String password = "root";
        Connection conn =  DriverManager.getConnection(url,user,password);


        /*利用Connection接口方法createStatement()创建一个Statement对象*/
       Statement stat =  conn.createStatement();
       /*利用statement接口方法获取结果集*/
//        String sql = "DELETE  FROM sort WHERE sid ='8'";
        String sql = "UPDATE sort SET sdesc ='疯狂涨价' WHERE sid ='7'";
       int a = stat.executeUpdate(sql);
       /*利用指针进行判断，结果集之中是否还有元素*/
       /* while(rs.next()){
            System.out.println(rs.getInt("sid")+"---"+rs.getString("sname")
            +"---"+rs.getDouble("sprice")+"---"+rs.getString("sdesc"));

        }*/
       System.out.println(a);


    }

}
