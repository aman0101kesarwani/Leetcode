# Write your MySQL query statement below
select unique_id, name
from EmployeeUNI as eu
right join Employees as emp
on eu.id = emp.id
