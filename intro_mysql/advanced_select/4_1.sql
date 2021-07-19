#连表查询

# 查询每名员工的部门信息
SELECT 
e.empno, e.ename, d.dname
FROM t_emp e JOIN t_dept d ON e.deptno=d.deptno;

# 也可以把 ON  换成 WHERE
SELECT 
e.empno, e.ename, d.dname
FROM t_emp e JOIN t_dept d WHERE e.deptno=d.deptno;

#查询每个员工的工号 姓名 部门名称 底薪 职位 工资等级
SELECT
e.empno, e.ename, d.dname, e.sal, e.job, s.grade
FROM t_emp e JOIN t_dept d ON e.deptno=d.deptno
JOIN t_salgrade s ON e.sal BETWEEN s.losal AND s.hisal;

# 查询和SCOTT相同部门的人
SELECT 
ename
FROM t_emp WHERE deptno=
(SELECT deptno FROM t_emp WHERE ename="SCOTT")
AND ename!="SCOTT";
# 上面这种写法需要重复执行(SELECT deptno FROM t_emp WHERE ename="SCOTT")效率低下

# 可以用连表查询, 表自己和自己连接
SELECT
E2.ename
FROM   t_emp E1 JOIN  t_emp e2 ON e1.deptno=e2.deptno
WHERE e1.ename="SCOTT" AND  e2.ename!="SCOTT";

