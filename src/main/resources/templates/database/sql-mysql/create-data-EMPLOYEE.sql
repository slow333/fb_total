DROP TABLE IF EXISTS employees;
CREATE TABLE IF NOT EXISTS employees (
   employee_id INT AUTO_INCREMENT PRIMARY KEY,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   job_title VARCHAR(50) ,
   hourly_pay DECIMAL(5,2) ,
   hire_date DATE DEFAULT (CURRENT_DATE),
   office_id INT,
   CONSTRAINT FK_Office_id FOREIGN KEY (office_id)
      REFERENCES offices(office_id) 
      ON DELETE SET NULL
);

INSERT INTO employees (first_name, last_name, job_title, hourly_pay, office_id) VALUES
('Lynde', 'Aronson', 'Executive', null, 4),
('Mildrid', 'Sokale', 'Manager', null, 4),
('Hazel', 'Tarbert', 'Manager', null, 4),
('Cole', 'Kesterton', 'Marketing', null, 4),
('Theresa', 'Binney', 'Manager', null, 5),
('Estrellita','Daleman','Staff' ,null ,5),
('Ivy','Fearey','Engineer' ,null ,5),
('Alaster','Scutchin','Assistant' ,null ,2),
('Newarcy','Nortunen','Account' ,null ,1),
('NewSayer','Matterson','Engineer' ,null ,1),
('NewMindy','Crissil','Staff' ,null ,1),
('NewKeriann','Alloisi','Marketing' ,null ,1),
('Yovonnda', 'Magrannell', 'Marketing', null, 10),
('Darcy', 'Nortunen', 'Account', null, 1),
('Sayer', 'Matterson', 'Statistician', null, 1),
('Mindy', 'Crissil', 'Staff', null, 1),
('Keriann', 'Alloisi', 'Marketing', null, 1),
('North', 'de Clerc', 'Management', null, 2),
('Elladine', 'Rising', 'Worker', null, 2),
('Nisse', 'Voysey', 'Advisor', null, 2),
('Guthrey', 'Iacopetti', 'Assistant', null, 3),
('Kass', 'Hefferan', 'Analyst', null, 3),
('Virge', 'Goodrum', 'Manager', null, 3),
('Mirilla','Janowski','Accountant' ,null ,3),
('NewNorth','de Clerc','Manager' ,null ,2);

INSERT INTO employees (first_name, last_name, job_title, hourly_pay, office_id) VALUES
('NewElladine','Rising','Worker' ,null ,null),
('NewNisse','Voysey','Advisor' ,null ,null),
('NewGuthrey','Iacopetti','Assistant' ,null ,null),
('NewKass','Hefferan','Analyst' ,null ,null);

update employees set hire_date = '2020-01-22' where employee_id = 1;
update employees set hire_date = '2019-02-02' where employee_id = 2;
update employees set hire_date = '2021-11-2' where employee_id = 3;
update employees set hire_date = '2022-4-5' where employee_id = 4; 
update employees set hire_date = '2023-7-7' where employee_id = 5;
update employees set hire_date = '2019-12-4' where employee_id = 6;
update employees set hire_date = '2019-9-9' where employee_id = 7;
update employees set hire_date = '2018-09-19' where employee_id = 8;
update employees set hire_date = '2017-08-21' where employee_id = 9;
update employees set hire_date = '2015-07-3' where employee_id = 10;   
update employees set hire_date = '2010-06-4' where employee_id = 11;
update employees set hire_date = '1999-04-5' where employee_id = 12;
update employees set hire_date = '1998-04-23' where employee_id = 13;
update employees set hire_date = '1997-03-25' where employee_id = 14;
update employees set hire_date = '1996-02-28' where employee_id = 15;
update employees set hire_date = '1995-10-29' where employee_id = 16;
update employees set hire_date = '1994-09-30' where employee_id = 17;
update employees set hire_date = '1993-08-31' where employee_id = 18;

update employees set hourly_pay = round(10 + (rand() * 50), 2);
