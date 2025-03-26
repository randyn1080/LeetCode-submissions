# Write your MySQL query state
SELECT name
FROM salesperson 
WHERE sales_id NOT IN (SELECT DISTINCT o.sales_id
FROM orders o
JOIN company c
USING(com_id)
WHERE name = "RED")

