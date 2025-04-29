# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e, Employee a
Where e.managerID=a.id
  AND e.salary> a.salary
