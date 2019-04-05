package dbutils;

import jdbcdemo.jdbcproperties.JDBCUtilsConfig;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 使用QueryRunner接口中的方法
 *
 * @author: lrk
 * 2019/4/4 20:07
 */
public class QueryRunnerDemo {
    private static Connection conn = JDBCUtilsConfig.getConnection();
    public static void main(String[] args) throws SQLException{
        //insert();
        //delete();
        update();



    }
    public static void insert() throws SQLException {
        QueryRunner qs =new QueryRunner();
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] param={"XXX",101.2,"购买XXX"};
        int row = qs.update(conn,sql,param);
        System.out.println(row);
        DbUtils.closeQuietly(conn);
    }

    public static void delete() throws SQLException{
        QueryRunner qs =new QueryRunner();
        String sql = "DELETE FROM sort WHERE sid =?";
        Object[] param={12};
        int row = qs.update(conn,sql,param);
        System.out.println(row);
        DbUtils.closeQuietly(conn);
    }

    public static void update() throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "UPDATE sort SET sname=?,sdesc=? WHERE sid =?";
        Object[] param = {"佛山特产","盲公饼",9};
        int row = qr.update(conn,sql,param);
        System.out.println(row);
    }

}
