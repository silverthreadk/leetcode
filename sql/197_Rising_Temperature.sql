# Write your MySQL query statement below
select today.id as Id
from Weather as today
join Weather as yesterday on today.recordDate = date_add(yesterday.recordDate, interval 1 day)
where today.Temperature > yesterday.Temperature;