# honest-boat-2230

# The Basic Prerequisites of this Applications are.
- [x] Should Have a MySQL Server and a Database Created.
- [x] Should have created folllowing tables into the database WITH SAME DATATYPES.


- [X] TABLE HOD

| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| hodId     | int         | NO   | PRI | NULL    | auto_increment |
| FirstName | varchar(20) | NO   |     | NULL    |                |
| LastName  | varchar(20) | NO   |     | NULL    |                |
| username  | varchar(20) | NO   | UNI | NULL    |                |
| password  | varchar(20) | NO   |     | NULL    |                |

<hr />

- [X] TABLE ENGINEER
- [X] AUTO INCREMENT SHOULD START FROM 1001.

| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| EngId      | int         | NO   | PRI | NULL    | auto_increment |
| FirstName  | varchar(50) | YES  |     | NULL    |                |
| LastName   | varchar(50) | YES  |     | NULL    |                |
| Department | varchar(20) | YES  |     | NULL    |                |
| username   | varchar(20) | NO   | UNI | NULL    |                |
| password   | varchar(20) | NO   |     | NULL    |                |

<hr />

- [x] TABLE EMPLOYEE
- [x] AUTO INCREMENT SHOULD START FROM 101.


| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| EmpId      | int         | NO   | PRI | NULL    | auto_increment |
| FirstName  | varchar(50) | YES  |     | NULL    |                |
| LastName   | varchar(50) | YES  |     | NULL    |                |
| Department | varchar(20) | YES  |     | NULL    |                |
| username   | varchar(20) | NO   | UNI | NULL    |                |
| password   | varchar(20) | NO   |     | NULL    |                |

<hr />

- [x] TABLE COMPLAINTS


| Field       | Type         | Null | Key | Default    | Extra |
|-------------|--------------|------|-----|------------|-------|
| Id          | varchar(50)  | NO   | PRI | NULL       |       |
| description | varchar(250) | NO   |     | NULL       |       |
| Type        | varchar(20)  | NO   |     | NULL       |       |
| EmpId       | int          | YES  | MUL | NULL       |       |
| EngId       | int          | YES  | MUL | NULL       |       |
| Status      | varchar(50)  | YES  |     | unassigned |       |




