package indi.chester.connectionsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSample {

    public static void main(String[] args) {
        //JDBC 驱动类
        String dbDriver="com.mysql.cj.jdbc.Driver";

        //数据库连接字符串
        String dbURL="jdbc:mysql://localhost:3306/jdbc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";

        //数据库用户名
        String dbUsername="root";

        //数据库密码
        String dbPassword="123456";

        try {
            Class.forName(dbDriver);
            Connection cnn= DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            System.out.println(cnn);
        } catch (ClassNotFoundException e) {//不存在JDBC驱动包
            e.printStackTrace();
        } catch (SQLException throwables) {//所有JDBC操作SQL的异常
            throwables.printStackTrace();
        }


    }


}
