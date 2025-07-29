# Write your MySQL query statement below
SELECT class
FROM courses
Group BY class
HAVING COUNT(student)>=5;