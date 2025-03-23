# Write your MySQL query statement below
SELECT employee_id
FROM Employees
WHERE (manager_id != NULL OR manager_id NOT IN (SELECT e.manager_id
FROM Employees e
JOIN Employees m
ON e.manager_id = m.employee_id))
       AND salary < 30000
ORDER BY employee_id asc