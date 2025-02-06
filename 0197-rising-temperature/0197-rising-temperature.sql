# Write your MySQL query statement below
SELECT 
    w.id AS Id
FROM 
    Weather w
JOIN
    Weather ww
ON
    w.recordDate = DATE_ADD(ww.recordDate, INTERVAL 1 day)
WHERE
    ww.temperature < w.temperature