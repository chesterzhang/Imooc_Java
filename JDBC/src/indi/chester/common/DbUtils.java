package indi.chester.common;

import java.sql.*;

public class DbUtils {
    /**
     * 创建新的数据库连接
     * @return 新的 Connection 对象
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public  static Connection getConnection(){

        //JDBC 驱动类
        String dbDriver="com.mysql.cj.jdbc.Driver";

        //数据库连接字符串
        String dbURL="jdbc:mysql://localhost:3306/jdbc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";

        //数据库用户名
        String dbUsername="root";

        //数据库密码
        String dbPassword="123456";

        Connection conn=null;

        try {
            //1.加载并注册JDBC驱动
            Class.forName(dbDriver);

            //2.创建数据库连接
            conn = DriverManager.getConnection(dbURL,dbUsername,dbPassword);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            return conn;
        }

    }

    /**
     * 关闭连接, 释放资源
     * @param res 结果集对象
     * @param stmt Statement 对象
     * @param conn Connection 对象
     */
    public static  void closeConnection(ResultSet res, Statement stmt, Connection conn){
        try {
            if (res!=null){
                res.close();
            }
            if (stmt!=null){
                stmt.close();
            }
            if (conn!=null && conn.isClosed()==false){
                //5.关闭连接，释放资源
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
