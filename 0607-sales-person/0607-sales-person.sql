# Write your MySQL query statement below
select name from Salesperson left join
(select sales_id from Orders join Company on Company.com_id=Orders.com_id where Company.name="RED")
as t on Salesperson.sales_id=t.sales_id where t.sales_id is NULL;
