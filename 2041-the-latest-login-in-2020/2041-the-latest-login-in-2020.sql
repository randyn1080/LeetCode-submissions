# Write your MySQL query statement below
SELECT user_id, Max(time_stamp) AS last_stamp
FROM logins
WHERE YEAR(time_stamp) = '2020'
GROUP BY 1