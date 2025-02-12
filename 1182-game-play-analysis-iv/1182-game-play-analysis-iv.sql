SELECT 
    ROUND(num/total, 2) AS fraction
FROM
    (SELECT
    COUNT(*) AS num
FROM
    Activity
WHERE
    (player_id, 
    DATE_SUB(event_date, INTERVAL 1 DAY)) 
    IN 
    (SELECT
        player_id,
        MIN(event_date)
    FROM
        Activity
    GROUP BY
        player_id)) AS n
CROSS JOIN
    (SELECT COUNT(*) AS total
    FROM (
        SELECT DISTINCT player_id
        FROM Activity
    ) AS t) AS d;



