package indi.chester.hrapp;

//完成数据新增的工作

import indi.chester.common.DbUtils;
import indi.chester.hrapp.Command;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertCommand implements Command {

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入员工编号: ");
        int eno=sc.nextInt();

        System.out.println("请输入员工姓名: ");
        String ename= sc.next();

        System.out.println("请输入员工薪资: ");
        Float salary = sc.nextFloat();

        System.out.println("请输入员工部门: ");
        String dname = sc.next();


        System.out.println("请输入入职日期: ");
        String hiredateString = sc.next();
        //1.将 String 转换为 java.util.Date
        java.util.Date udhiredate=null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            udhiredate= sdf.parse(hiredateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //2.将 java.util.Date 转化为 java.sql.Date
        long time = udhiredate.getTime();//获取自1970年到现在的毫秒数
        java.sql.Date sdhiredate=new java.sql.Date(time);

        //获取 Connection 对象
        Connection conn= DbUtils.getConnection();

        String sqlcmd= "INSERT INTO employee(eno,ename,salary, dname, hiredate) values(?,?,?,?,?)";

        int writeCount= 0;//所有写操作都用executeUpdate(), 返回影响记录数量
        try {
            PreparedStatement pstmt=conn.prepareStatement(sqlcmd);
            pstmt.setInt(1,eno);
            pstmt.setString(2, ename);
            pstmt.setFloat(3,salary);
            pstmt.setString(4,dname);
            pstmt.setDate(5,sdhiredate);
            writeCount = pstmt.executeUpdate();
            System.out.println("writeCount:" + writeCount);
            System.out.println(ename+"员工入职已办理");
            DbUtils.closeConnection(null,pstmt,conn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
