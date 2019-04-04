package jdbcdemo.jdbcproperties;

import java.io.InputStream;
import java.util.Properties;

/**测试properties配置文件放在那里有效--src创建Resource Bundle文件，不用写后缀
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
