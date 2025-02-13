# Write your MySQL query statement below
SELECT product_id, year as first_year, quantity, price 
FROM Product p
JOIN Sales s USING(product_id)
WHERE (product_id, year) IN (
    SELECT product_id, MIN(year)
    FROM Sales
    GROUP BY product_id
)
    
