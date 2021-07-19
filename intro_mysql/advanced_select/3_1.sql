# GROUP BY 某一列
#按照某一列进行分组,然后在各个组内进行数据汇总
#求各个部门的平均工资
SELECT deptno, ROUND(AVG(sal)) FROM t_emp
GROUP BY deptno;

# 逐级分组
# 统计不同部门的不同岗位的平均底薪和人数
SELECT deptno,job, ROUND(AVG(sal)),COUNT(*) FROM t_emp
GROUP BY deptno,job ORDER BY deptno;

# WITH ROLLUP 对汇总出来的数据再次汇总
# 如统计不同部门的的平均底薪，最高底薪，最低底薪和人数

SELECT deptno,  ROUND(AVG(sal)),ROUND(MAX(sal)),ROUND(MIN(sal)), COUNT(*) FROM t_emp
GROUP BY deptno WITH ROLLUP;
#上面这一句SQL不能加 ORDER BY deptno, 因为最后一行是对上面做了统计的,排序没有意义

# GROUP_CONCAT(某一列) 把分组中的某一列的所有项拼接成一个字符串,以逗号分隔
# 如统计每个部门底薪超过2000的人数和姓名
SELECT
deptno, GROUP_CONCAT(ename),COUNT(*)
FROM t_emp WHERE sal>=2000 GROUP BY deptno;

#FROM -> WHERE -> GROUP BY -> SELECT -> ORDER BY -> LIMIT


# HAVING 
# 查询部门平均底薪超过2000元的部门编号

# 下面这一句是错的,因为WHERE> GROUP BY ,
# 需要GROUP BY 确定范围,才能进行AVG统计
-- SELECT deptno FROM t_emp
-- WHERE AVG(sal)>=2000 
-- GROUP BY deptno;
 

SELECT deptno FROM t_emp
GROUP BY deptno HAVING AVG(sal)>=2000 ;

# 查询每个部门中, 入职在1982年以后的员工超过2个的 部门编号
SELECT deptno FROM t_emp
WHERE hiredate>"1982-01-01"
GROUP BY deptno HAVING COUNT(*)>=2;


