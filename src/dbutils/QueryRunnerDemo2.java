package dbutils;

import jdbcdemo.jdbcdomain.Sort;
import jdbcdemo.jdbcproperties.JDBCUtilsConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author: lrk
 * 2019/4/4 21:14
 */
public class QueryRunnerDemo2 {
    private static Connection conn = JDBCUtilsConfig.getConnection();

    public static void main(String[] args) throws SQLException {
//        arrayHandler();
//        arrayListhandler();
//        beanHandler();
//        beanListHandler();
//        columnListHandler();
//        scalarHandler();
//        mapHandler();
        mapListHandler();
    }

    public static void arrayHandler() throws SQLException {
        /*将结果集第一行存储到对象数组中*/
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        Object[] obj = qr.query(conn, sql, new ArrayHandler());
        for (Object o : obj) {
            System.out.println(o);
        }
    }

    public static void arrayListhandler() throws SQLException {
        /**
         * @Description:将结果的每一行封装到对象数组中，对象数组中存储在List集合中
         * @params:[]
         * @return:void
         */

        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        List<Object[]> list = qr.query(conn, sql, new ArrayListHandler());
        for (Object[] obj : list) {
            for (Object o : obj) {
                System.out.print(o + "  ");
            }
            System.out.println();
        }
    }

    public static void beanHandler() throws SQLException {
        /*将结果集的第一行数据,封装成JavaBean对象
        注意: 被封装成数据到JavaBean对象, Sort类必须有空参数构造*/
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        Sort s = qr.query(conn, sql, new BeanHandler<>(Sort.class));
        System.out.println(s);

    }
    public static void beanListHandler() throws SQLException {
        /*
         *  结果集第四种处理方法, BeanListHandler
         *  结果集每一行数据,封装JavaBean对象
         *  多个JavaBean对象,存储到List集合
         */
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        List<Sort> list= qr.query(conn, sql, new BeanListHandler<>(Sort.class));
        for(Sort s:list){
            System.out.println(s);
        }

    }
    public static void columnListHandler() throws SQLException{
       /* 结果集第五种处理方法,ColumnListHandler
       结果集,指定列的数据,存储到List集合
        List<Object> 每个列数据类型不同
        */
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        List<Object> list = qr.query(conn,sql,new ColumnListHandler<>("sname"));
        for(Object o :list){
            System.out.println(o);
        }
    }
    public static void scalarHandler() throws SQLException{
        /*结果集第六种处理方法,ScalarHandler
        对于查询后,只有1个结果*/
        QueryRunner qr = new QueryRunner();
        String sql ="SELECT COUNT(*) FROM sort";
        Long l = qr.query(conn,sql,new ScalarHandler<>());
        System.out.println(l);
    }
    public static void mapHandler() throws SQLException{
        /*将结果集第一行数据封装到Map集合中*/
        QueryRunner qr = new QueryRunner();
        String sql ="SELECT * FROM sort";
        Map<String ,Object> map= qr.query(conn,sql,new MapHandler());
        /*Map的遍历不要忘记了*/
        for(String key:map.keySet()){
            System.out.println(key +"---"+map.get(key));

        }

    }
    public static void mapListHandler() throws SQLException{
        /*将结果集的每一行数据封装到Map集合中，将多个Map集合存储到List中*/
        QueryRunner qr = new QueryRunner();
        String sql ="SELECT * FROM sort";
        List<Map<String ,Object>> list= qr.query(conn,sql,new MapListHandler());
        /*嵌套查询，外循环是每个Map，内循环式Map中的键值对*/
        for(Map<String ,Object> map :list){
            for(String key:map.keySet()){
                System.out.print(key+"---"+map.get(key));
            }
    System.out.println();
        }

    }
}
