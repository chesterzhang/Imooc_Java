package indi.chester.hrapp;

import indi.chester.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCommand implements  Command{


    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入员工编号: ");
        int eno=sc.nextInt();

        System.out.println("请输入员工新的薪资: ");
        Float salary= sc.nextFloat();

        //获取 Connection 对象
        Connection conn= DbUtils.getConnection();

        String sqlcmd= "UPDATE employee SET salary=? where eno=?";

        int writeCount= 0;//所有写操作都用executeUpdate(), 返回影响记录数量
        try {
            PreparedStatement pstmt=conn.prepareStatement(sqlcmd);

            pstmt.setFloat(1,salary);
            pstmt.setInt(2,eno);

            writeCount = pstmt.executeUpdate();
            System.out.println("writeCount:" + writeCount);
            if (writeCount==1){
                System.out.println(eno+"员工已更新工资");
            }else {
                System.out.println("未找到"+eno+"员工资料");
            }


            DbUtils.closeConnection(null,pstmt,conn);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

