package indi.chester.hrapp;

import java.sql.*;
import java.util.Scanner;

public class QueryCommand  implements Command {

    //执行具体的SQL操作, 通过JDBC标准5步骤
    @Override
    public void execute() {

        System.out.println("请输入部门名称:");
        Scanner sc= new Scanner(System.in);
        String pdname = sc.nextLine();//若输入 ' or 1 = 1 or 1= ', 则向 SQL 语句注入攻击

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
            Connection conn = DriverManager.getConnection(dbURL,dbUsername,dbPassword);

            //3. 创建statement 对象并执行 SQL 语句
            Statement stmt= conn.createStatement();

            //ResultSet 是结果集，也是一个JDBC接口
            String sqlcmd="SELECT * FROM employee where dname='"+pdname+"'";
            System.out.println(sqlcmd);
            ResultSet res=stmt.executeQuery(sqlcmd);

            //4.遍历结果
            while (res.next()){
                int eno=res.getInt(1);//JDBC字段索引从1开始
                String ename = res.getString("ename");
                Float salary=res.getFloat("salary");
                String dname=res.getString("dname");
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
