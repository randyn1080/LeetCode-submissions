# Write your MySQL query statement below
DELETE P1 FROM Person P1
JOIN Person P2 on p1.email = p2.email
WHERE p1.id > p2.id;