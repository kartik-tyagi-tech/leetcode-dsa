# Write your MySQL query statement below
select r.contest_id,round(count( distinct r.user_id)/ (select count( user_id ) from users)*100,2) as percentage
from users u
inner join register r
on u.user_id=r.user_id
group by r.contest_id
order by percentage desc,contest_id asc;