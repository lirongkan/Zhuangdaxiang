package jdbcdemo.jdbcproperties;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Use properties file
 *
 * @author: lrk
 * 2019/4/4 12:18
 */
public class JDBCUtilsConfig {
    private static Connection conn ;
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    static{
        try{
            readConfig();
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception ex){

        }
    }

    private static void readConfig() throws Exception{
        InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
        Properties pro = new Properties();
        pro.load(in);
        driverClass=pro.getProperty("driverClass");
        url = pro.getProperty("url");
        username = pro.getProperty("username");
        password = pro.getProperty("password");
    }


    public static Connection getConnection(){
        return conn;
    }

}
