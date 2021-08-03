CREATE DATABASE Assignment_sql1;
use Assignment_sql1;

DROP TABLE IF EXISTS Project;
CREATE TABLE Project (
   Pid VARCHAR(255),
   Pname VARCHAR(255));

INSERT INTO Project VALUES('P189', 'Rest');
INSERT INTO Project VALUES('P546', 'Spring');
INSERT INTO Project VALUES('P547', 'Maven');
INSERT INTO Project VALUES('P567', 'Swift');
INSERT INTO Project VALUES('P789', 'Angular');
INSERT INTO Project VALUES('P799', 'Script');
INSERT INTO Project VALUES('P805', 'Mssql');
INSERT INTO Project VALUES('P855', 'Perl');
INSERT INTO Project VALUES('P895', 'Python');
INSERT INTO Project VALUES('P902', 'Ruby');
INSERT INTO Project VALUES('P928', 'R');



DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee (
   Eid INT   NOT NULL,
   Ename VARCHAR(255),
   Pid VARCHAR(255));

INSERT INTO Employee VALUES(100, 'ABC', 'P189');
INSERT INTO Employee VALUES(101, 'MNP', 'P789');
INSERT INTO Employee VALUES(102, 'DEF', 'P567');
INSERT INTO Employee VALUES(103, 'JKL', NULL);
INSERT INTO Employee VALUES(104, 'GHJ', 'P567');
INSERT INTO Employee VALUES(105, 'UJM', 'P189');
INSERT INTO Employee VALUES(106, 'UJM', NULL);
INSERT INTO Employee VALUES(107, 'RGJ', 'P567');
INSERT INTO Employee VALUES(108, 'IJH', NULL);
INSERT INTO Employee VALUES(109, 'NMH', 'P547');
INSERT INTO Employee VALUES(110, 'SDF', 'P189');
INSERT INTO Employee VALUES(111, 'TGB', 'P546');
INSERT INTO Employee VALUES(112, 'HUF', NULL);
INSERT INTO Employee VALUES(113, 'SDF', 'P789');
INSERT INTO Employee VALUES(114, 'RGJ', 'P567');
INSERT INTO Employee VALUES(115, 'JKG', 'P189');


-- 1)
P
SELECT Pid, Pname AS ProjectName FROM Project WHERE pid NOT IN (SELECT pid FROM Employee WHERE pid IS NOT null);
-- 2)
SELECT Ename AS EmployeeName FROM Employee WHERE Pid = (SELECT Pid FROM Employee WHERE Ename = 'ABC') AND Ename != 'ABC';

-- 3)
SELECT Project.Pname AS ProjectName, COUNT(Employee.Ename) AS Total FROM Project INNER JOIN Employee
ON Project.pid=Employee.pid GROUP BY Project.Pname;

-- 4)
SELECT Pname AS ProjectName FROM(SELECT Project.Pname, count(Employee.Ename) AS total FROM
Employee INNER JOIN Project ON Project.pid = Employee.pid GROUP BY Project.Pname) AS t WHERE total>=2;

-- 5)
SELECT Employee.Ename AS EmployeeName, Project.Pname AS ProjectName FROM Employee INNER JOIN Project WHERE Project.pid = Employee.pid
ORDER BY EmployeeName, ProjectName;
