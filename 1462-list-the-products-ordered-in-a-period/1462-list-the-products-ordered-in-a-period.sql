# Write your MySQL query statement below
select product_name, sum(o.unit) as unit
from orders o
join products p using(product_id)
where o.order_date between '2020-02-01' and '2020-02-29'
group by 1
having sum(o.unit) >= 100