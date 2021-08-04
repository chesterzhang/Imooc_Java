package indi.chester.dbuutils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import indi.chester.entity.Employee;
import org.apache.commons.dbutils.QueryRunner;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;

import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

// Apache DBUtils + Druid 联合使用
public class DbUtilsSample {

    private static  void query(){
        //Properties 类, 就是用来读取配置文件的, java 配置文件以 .properties 结尾
        Properties properties =new Properties();
        String propertiesFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();

        try {
            propertiesFile = new URLDecoder().decode(propertiesFile,"UTF-8");
            properties.load(new FileInputStream(propertiesFile));
            DataSource dataSource= DruidDataSourceFactory.createDataSource(properties);
            //创建查询对象,查询完自动关闭连接, 无需手动关闭
            QueryRunner qr =new QueryRunner(dataSource);
            List<Employee> empList=qr.query("SELECT * FROM employee LIMIT ?,10", new BeanListHandler<>(Employee.class),
                    new Object[]{0});

            for(Employee emp: empList){
                System.out.println(emp.getEname());
            }

        } catch ( Exception e) {
            e.printStackTrace();
        }

    }

    public static  void update(){
        //Properties 类, 就是用来读取配置文件的, java 配置文件以 .properties 结尾
        Properties properties =new Properties();
        String propertiesFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();

        Connection conn = null;
        try {
            propertiesFile = new URLDecoder().decode(propertiesFile,"UTF-8");
            properties.load(new FileInputStream(propertiesFile));
            DataSource dataSource= DruidDataSourceFactory.createDataSource(properties);

            //写入操作 依赖 事务, 事务必须取得连接
            conn = dataSource.getConnection();
            //手动关闭自动提交
            conn.setAutoCommit(false);
            String sql1="UPDATE employee set salary=salary+1000 WHERE eno=?";
            String sql2="UPDATE employee set salary=salary-500 WHERE eno=?";
            QueryRunner qr= new QueryRunner();
            qr.update(conn,sql1,new Object[]{100});
            qr.update(conn,sql2,new Object[]{3308});

            conn.commit();
        } catch ( Exception e) {
            e.printStackTrace();
            try {
                if (conn!=null && !conn.isClosed()){
                    conn.rollback();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            try {
                if (conn!=null && !conn.isClosed()){
                    conn.close();//数据库连接进行回收, 也就是将连接放回连接池
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        DbUtilsSample.query();
        DbUtilsSample.update();
    }

}
