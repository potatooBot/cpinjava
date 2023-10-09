CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;
RETURN (
      # Write your MySQL query statement below.
       SELECT Distinct(salary) from Employee order by salary DESC
        LIMIT N,1
  );
END