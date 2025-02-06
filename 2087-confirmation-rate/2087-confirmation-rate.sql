SELECT  
    user_id,
    ROUND(SUM(IF(c.action = 'confirmed', 1, 0)) / COUNT(*), 2) AS confirmation_rate
FROM
    Signups s
LEFT JOIN
    Confirmations c
    USING(user_id)
GROUP BY
    user_id
ORDER BY
    confirmation_rate