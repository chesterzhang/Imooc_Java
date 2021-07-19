#查询底薪超过公司平均底薪的员工信息
-- SELECT
-- e1.ename, e1.sal
-- FROM t_emp e1 JOIN t_emp e2 WHERE e1.sal > AVG(e2.sal);
# 上面这一句话是有问题的,AVG 不能放在 WHERE 里面

SELECT 
e1.ename, e1.sal
FROM t_emp e1 JOIN
(SELECT AVG(sal) avg FROM t_emp) t
WHERE e1.sal>=t.avg;


#查询RESEARCH部门的人数, 最高底薪,最低底薪,平均底薪,平均工龄
SELECT
COUNT(*), MAX(e1.sal),MIN(e1.sal), AVG(e1.sal), AVG(DATEDIFF(NOW(),e1.hiredate)/365)
FROM t_emp e1 JOIN t_dept d1 ON e1.deptno=d1.deptno WHERE d1.dname="RESEARCH";
# 当有JOIN 后面又有WHERE时,JOIN 必须和 ON 连用


# CEIL FLOOR 方法
SELECT CEIL(1.1)
SELECT FLOOR(1.1)


# 查询每种职业的最高工资, 最低工资, 平均工资, 最高工资等级和最低工资等级
SELECT
e.job, MAX(e.sal), MIN(e.sal), AVG(e.sal), MAX(s.grade), MIN(s.grade)
FROM t_emp e JOIN t_salgrade s
ON (e.sal+IFNULL(e.comm,0)) BETWEEN s.losal AND s.hisal
GROUP BY e.job ;

# 查询每个底薪超过部门平均底薪的员工信息
SELECT
e1.ename, e1.sal
FROM  t_emp e1 JOIN (SELECT deptno, AVG(sal) avg FROM t_emp e2 GROUP BY deptno) s
ON e1.deptno=s.deptno
WHERE e1.sal>=s.avg;
 

