package indi.chester.entity;

import java.util.Date;

// 员工实体类, 类的名称与 数据表相同, 首字母大写
public class Employee {
    /*
    1. 具备默认构造函数
    2. 私有属性 和 数据表字段相同
    3. 公有 setter 和 getter
     */

    public Employee(){}

    private  Integer eno;
    private  String ename;
    private  Float salary;
    private String dname;
    private Date hiredate;

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
