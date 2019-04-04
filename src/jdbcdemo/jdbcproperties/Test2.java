package jdbcdemo.jdbcproperties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: lrk
 * 2019/4/4 13:05
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        //FileInputStream fis =new FileInputStream("src\\jdbcdemo\\jdbcproperties\\Test2.java");
        InputStream in = Test2.class.getClassLoader().getResourceAsStream("database.properties");
        System.out.println(in);
        Properties pro = new Properties();
        pro.load(in);
        System.out.println(pro);
    }

}
