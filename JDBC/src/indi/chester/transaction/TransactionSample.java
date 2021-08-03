package indi.chester.transaction;

import indi.chester.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionSample {

    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;

        conn= DbUtils.getConnection();
        String sqlcmd="INSERT INTO employee(eno,ename,salary,dname) values(?,?,?,?)";

        //手动开启事务模式
        try {
            conn.setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (int i = 1000; i <1010 ; i++) {
            //模拟操作数据库被中断
            if (i==1001){
                throw  new RuntimeException("插入失败");
            }

            try {
                pstmt=conn.prepareStatement(sqlcmd);
                pstmt.setInt(1,i);
                pstmt.setString(2,"员工"+i);
                pstmt.setFloat(3,5000);
                pstmt.setString(4,"市场部");
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();

                //遇到意外, 回滚数据
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        //不出意外, 提交数据更改
        try {
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DbUtils.closeConnection(null,pstmt,conn);

    }



}
