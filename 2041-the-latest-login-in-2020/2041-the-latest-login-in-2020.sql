# Write your MySQL query statement below
SELECT user_id, Max(time_stamp) AS last_stamp
FROM logins
WHERE time_stamp BETWEEN '2020-01-01 00:00:00' AND '2020-12-31 23:59:59'
GROUP BY 1