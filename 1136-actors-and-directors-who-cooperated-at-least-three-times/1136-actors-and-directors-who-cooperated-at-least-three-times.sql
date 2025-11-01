# Write your MySQL query statement below
SELECT actor_id,director_id from ActorDirector
Group BY actor_id,director_id
HAVING Count(actor_id=director_id) >=3;
