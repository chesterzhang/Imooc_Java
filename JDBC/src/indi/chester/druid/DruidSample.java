package indi.chester.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import indi.chester.common.DbUtils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;

import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidSample {
    public static void main(String[] args) {
        //1.加载属性文件
        //Properties 类, 就是用来读取配置文件的, java 配置文件以 .properties 结尾
        Properties properties=new Properties();
        //获取在当前类路径下特定文件的路径, 也就是在 out 目录下
        String propertiesFile =DruidSample.class.getResource("/druid-config.properties").getPath();

        //容错处理, 默认对路径使用URL编码, 若路径有空格或是中文字符, 则会出错,得还原成UTF-8编码

        try {
            propertiesFile = new URLDecoder().decode(propertiesFile,"UTF-8");
            properties.load(new FileInputStream(propertiesFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet res=null;
        try {
            //2.获取DataSource 数据源对象, 数据源就是数据库在JDBC中的别称
            DataSource dataSource= DruidDataSourceFactory.createDataSource(properties);
            //3.创建数据库连接
            for (int i = 0; i <20 ; i++) {
                conn=dataSource.getConnection();
            }
            pstmt=conn.prepareStatement("SELECT * FROM employee LIMIT 0,10");
            res=pstmt.executeQuery();
            while (res.next()){
                int eno=res.getInt(1);//JDBC字段索引从1开始
                String ename = res.getString("ename");
                Float salary=res.getFloat("salary");
                String dname=res.getString("dname");
                System.out.println(dname+"-"+eno+"-"+ename+"-"+salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /**
             * 不使用连接池, conn.close 关闭数据库连接
             * 使用连接池, conn.close 将连接放回连接池
             */
            DbUtils.closeConnection(res,pstmt,conn);
        }

    }

}


