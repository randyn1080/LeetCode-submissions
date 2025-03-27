# Write your MySQL query statement below
SELECT score, dense_rank() OVER (order by score desc) AS 'rank'
from scores