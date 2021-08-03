package indi.chester.jdbcsample;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class StandardJDBCSample {
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
            //1.加载并注册JDBC驱动
            Class.forName(dbDriver);

            //2.创建数据库连接
            //Connection 对象 用于JDBC与数据库的网络通信对象
            //java.sql.Connection 是一个接口, 具体驱动由厂商实现
            Connection conn = DriverManager.getConnection(dbURL,dbUsername,dbPassword);

            //3. 创建statement 对象并执行 SQL 语句
            Statement stmt= conn.createStatement();
            ResultSet res=stmt.executeQuery("SELECT *FROM employee");

            //4.遍历查询结果
            while (res.next()){
                Integer eno=res.getInt(1);
                String ename=res.getString("ename");
                Float salary=res.getFloat("salary");
                String dname= res.getString("dname");
                System.out.println(dname+"-"+eno+"-"+ename+"-"+salary);
            }


            if (conn!=null && conn.isClosed()==false){
                //5.关闭连接，释放资源
                conn.close();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
