package datasourcedemo;

import jdbcdemo.jdbcdomain.Sort;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.util.List;
import java.util.Map;

/**
 * 使用DataSource接口配置连接
 *
 * @author: lrk
 * 2019/4/5 9:37
 */
public class QueryRunnerDemo2 {
    public static void main(String[] args) {
        //insert();
        select_2();
    }
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

   /* public static void insert(){
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] param = {"怡宝",3.00,"自己买的水"};
        try {
            int row = qr.update(sql, param);
            System.out.println(row);
        }catch(Exception ex){
            System.out.println(ex);
            throw new RuntimeException("数据添加失败！");
        }
    }*/
    public static void select(){
        String sql="SELECT * FROM sort";
        try {
            List<Map<String,Object>> list = qr.query(sql, new MapListHandler());
            for(Map<String ,Object> map :list){
                for(String s:map.keySet()){
                    System.out.print(s + "\t"+map.get(s)+"\t");
                }
                System.out.println();
            }
        }catch(Exception ex){
            throw new RuntimeException("数据查询失败！");
        }

    }
    public static void select_2(){
        String sql = "SELECT * FROM sort";
        try{
            Sort s = qr.query(sql,new BeanHandler<>(Sort.class));
                System.out.println(s);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
