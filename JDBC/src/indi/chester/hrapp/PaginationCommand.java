package indi.chester.hrapp;

import indi.chester.common.DbUtils;
import indi.chester.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 分页查询员工数据

public class PaginationCommand implements Command {
    @Override
    public void execute() {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入页号:");
        int page= sc.nextInt();

        Connection conn=null;
        PreparedStatement pstm =null;
        ResultSet res=null;

        conn= DbUtils.getConnection();
        String sqlcmd="SELECT * FROM employee LIMIT ?,10 ";

        List<Employee> list = null;
        try {
            pstm=conn.prepareStatement(sqlcmd);
            pstm.setInt(1,(page-1)*10);
            res=pstm.executeQuery();

            list = new ArrayList();
            while (res.next()){
                Integer eno=res.getInt("eno");
                String ename=res.getString("ename");
                Float salary=res.getFloat("salary");
                String dname=res.getString("dname");
                Date hiredate =res.getDate("hiredate");
                Employee emp=new Employee();
                emp.setEno(eno);
                emp.setEname(ename);
                emp.setSalary(salary);
                emp.setDname(dname);
                emp.setHiredate(hiredate);
                list.add(emp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeConnection(res,pstm,conn);
        }
        System.out.println(list.size());

    }
}
