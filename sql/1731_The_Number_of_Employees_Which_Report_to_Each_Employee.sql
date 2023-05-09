# Write your MySQL query statement below
SELECT b.employee_id, b.name, COUNT(a.reports_to) AS reports_count, ROUND(AVG(a.age)) AS average_age
FROM employees AS a JOIN employees AS b ON a.reports_to = b.employee_id
GROUP BY a.reports_to
ORDER BY b.employee_id;