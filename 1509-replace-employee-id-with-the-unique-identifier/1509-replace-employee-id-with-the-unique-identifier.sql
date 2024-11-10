# Write your MySQL query statement below

select eu.unique_id as unique_id, em.name as name
FROM Employees em left join  EmployeeUNI eu
on eu.id = em.id;
