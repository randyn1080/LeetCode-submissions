# Write your MySQL query statement below
SELECT u.name, SUM(amount) AS balance
FROM users u
JOIN transactions t USING(account)
GROUP BY account
HAVING balance > 10000