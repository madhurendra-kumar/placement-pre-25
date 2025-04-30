# Write your MySQL query statement below
SELECT person.firstName, person.lastName,Address.city,address.state
from person
left join Address ON person.personID=Address.personId;
