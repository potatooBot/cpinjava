# Write your MySQL query statement below
#select patient_id,patient_name,conditions from Patients where conditions REGEXP '\\bDIAB1';
select patient_id,patient_name,conditions from Patients where conditions LIKE 'DIAB1%' or conditions like '% DIAB1%';