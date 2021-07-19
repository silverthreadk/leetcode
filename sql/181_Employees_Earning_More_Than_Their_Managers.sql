# Write your MySQL query statement below
select e.Name as Employee from Employee as e
join Employee as m on e.ManagerId = m.Id
where e.Salary > m.Salary;