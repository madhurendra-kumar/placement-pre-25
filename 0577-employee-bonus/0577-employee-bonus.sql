# Write your MySQL query statement below
select Employee.name,Bonus.bonus 
from Employee
left join Bonus ON Employee.empID=Bonus.empID
where bonus<1000 or Bonus IS NULL;