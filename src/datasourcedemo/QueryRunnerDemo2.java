package datasourcedemo;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.util.List;

/**
 * 使用DataSource接口配置连接
 *
 * @author: lrk
 * 2019/4/5 9:37
 */
public class QueryRunnerDemo2 {
    public static void main(String[] args) {
        //insert();
        select();
    }
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public static void insert(){
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] param = {"怡宝",3.00,"自己买的水"};
        try {
            int row = qr.update(sql, param);
            System.out.println(row);
        }catch(Exception ex){
            System.out.println(ex);
            throw new RuntimeException("数据添加失败！");
        }
    }
    public static void select(){
        String sql="SELECT * FROM sort";
        try {
            List<Object[]> list = qr.query(sql, new ArrayListHandler());
            for(Object[] obj :list){
                for(Object o :obj){
                    System.out.print(o + "\t");
                }
                System.out.println();
            }
        }catch(Exception ex){
            throw new RuntimeException("数据查询失败！");
        }

    }
}
