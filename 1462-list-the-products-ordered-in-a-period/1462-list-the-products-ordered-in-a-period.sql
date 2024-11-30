select p.product_name, SUM(o.unit) as unit
from Products p , Orders o 
where 
p.product_id = o.product_id
and o.order_date between '2020-02-01' and '2020-02-29'
group by  p.product_id
having SUM(o.unit) >= 100;
