# Write your MySQL query statement below
select name , bonus
from employee as e
left join bonus as t 
on e.empId=t.empId
where bonus<1000 or bonus is null;