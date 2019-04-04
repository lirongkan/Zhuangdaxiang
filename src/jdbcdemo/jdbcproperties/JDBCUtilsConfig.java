package jdbcdemo.jdbcproperties;

import thread.waitandnotify.Input;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import static java.lang.Class.forName;

/**
 * Use properties file
 *
 * @author: lrk
 * 2019/4/4 12:18
 */
public class JDBCUtilsConfig {
    private static Connection conn;
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

        static{
            try {
                getConfig();
                Class.forName(driverClass);
                conn = DriverManager.getConnection(url,username,password);
            }catch(Exception ex){
                throw new RuntimeException();
            }
    }
        public static void getConfig() throws Exception{
            InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
            Properties pro = new Properties();
            pro.load(in);
            driverClass = pro.getProperty("driverClass");
            url =  pro.getProperty("url");
            username =pro.getProperty("username");
            password = pro.getProperty("password");

    }

        public static Connection getConnection(){
            return conn;
        }
}
/*
try{
        InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
        *//*取出键值对，用load方法，接收输入流*//*
        Properties pro = new Properties();
        pro.load(in);
        String driverClass =  pro.getProperty("driverClass");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        String url = pro.getProperty("url");
        Class.forName(driverClass);
        conn = DriverManager.getConnection(url,username,password);
        }catch(Exception ex){
        throw new RuntimeException();
        }*/


