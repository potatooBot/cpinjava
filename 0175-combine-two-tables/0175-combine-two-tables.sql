# Write your MySQL query statement below
SELECT p.firstname,p.lastName ,a.city,a.state from Person p left outer join address a on p.personId=a.personId; 