# Write your MySQL query statement below
select d.Name as 'Department', e.Name as 'Employee', e.Salary as 'Salary'
from Employee as e
join Department d on e.DepartmentId = d.Id
where (e.salary, e.DepartmentId ) in
    (select max(salary), DepartmentId
     from Employee
     group by DepartmentId);