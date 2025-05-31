DROP TABLE IF EXISTS offices;
CREATE TABLE IF NOT EXISTS offices (
   office_id INT AUTO_INCREMENT PRIMARY KEY,
   address VARCHAR(150) NOT NULL,
   city VARCHAR(50) NOT NULL
);

INSERT INTO offices (address, city) VALUES
('03 Reinke Trail', 'Cincinnati'),
('5507 Becker Terrace', 'New York City'),
('54 Northland Court', 'Richmond'),
('08 South Crossing', 'Cincinnati'),
('553 Maple Drive', 'Minneapolis'),
('23 North Plaza', 'Aurora'),
('9658 Wayridge Court', 'Boise'),
('9 Grayhawk Trail', 'New York City'),
('16862 Westend Hill', 'Knoxville'),
('4 Bluestem Parkway', 'Savannah');

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


DROP TABLE IF EXISTS customers;

CREATE TABLE IF NOT EXISTS customers (
   customer_id INT AUTO_INCREMENT PRIMARY KEY,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   frferral_id INT
);
INSERT INTO customers (first_name, last_name, referral_id) VALUES
('John', 'Doe', NULL),
('Jane', 'Smith', 1),
('Alice', 'Johnson', 2),
('Bob', 'Brown', 3),
('Charlie', 'Davis', 4),
('Diana', 'Garcia', 2),
('Ethan', 'Martinez', 4),
('Fiona', 'Lopez', 1),
('George', 'Wilson', 2),
('Hannah', 'Anderson', 3);

create table transactions (id INT PRIMARY KEY, customer_id INT, amount DECIMAL(8,2));
INSERT INTO transactions (id, customer_id, amount) VALUES
(1, 1, 100.00),
(2, 2, 200.00),
(3, 3, 300.00),
(4, 4, 400.00),
(5, 3, 500.00),
(6, 1, 600.00),
(7, 1, 700.00),
(8, 2, 22.00),
(9, 3, 1212.00),
(10, 10, 112.00),
(11, 1, 11.00),
(12, 2, 122.00),
(13, 3, 10.00),
(14, 1, 212.00),
(15, 5, 15.00),
(16, 2, 16.00),
(17, 7, 170.00),
(18, 1, 180.00),
(19, 9, 190.00),
(20, 3, 200.00);

CREATE table IF NOT EXISTS car (
	id INT AUTO_INCREMENT PRIMARY KEY,
	make VARCHAR(50),
	model VARCHAR(50),
	model_year VARCHAR(50)
);
insert into car (id, make, model, model_year) values (1, 'Ford', 'Ranger', 1985);
insert into car (id, make, model, model_year) values (2, 'Chevrolet', 'Blazer', 1998);
insert into car (id, make, model, model_year) values (3, 'Nissan', 'Frontier', 2012);
insert into car (id, make, model, model_year) values (4, 'Ford', 'LTD Crown Victoria', 1986);
insert into car (id, make, model, model_year) values (5, 'Chevrolet', 'Suburban 1500', 1998);
insert into car (id, make, model, model_year) values (6, 'Dodge', 'Neon', 2002);
insert into car (id, make, model, model_year) values (7, 'Geo', 'Metro', 1996);
insert into car (id, make, model, model_year) values (8, 'GMC', 'Sierra 3500', 2003);
insert into car (id, make, model, model_year) values (9, 'Nissan', 'Altima', 2012);
insert into car (id, make, model, model_year) values (724, 'Chrysler', 'Town & Country', 2012);
insert into car (id, make, model, model_year) values (725, 'Volkswagen', 'Beetle', 1965);
insert into car (id, make, model, model_year) values (726, 'Mitsubishi', 'Pajero', 1987);
insert into car (id, make, model, model_year) values (727, 'Chevrolet', 'Corvette', 2011);
insert into car (id, make, model, model_year) values (728, 'Dodge', 'Ram', 2010);
insert into car (id, make, model, model_year) values (729, 'Subaru', 'Outback', 2012);
insert into car (id, make, model, model_year) values (730, 'Lexus', 'ES', 1991);
insert into car (id, make, model, model_year) values (731, 'Audi', 'S8', 2006);
insert into car (id, make, model, model_year) values (732, 'Infiniti', 'EX', 2009);
insert into car (id, make, model, model_year) values (733, 'Pontiac', 'Grand Am', 2000);
insert into car (id, make, model, model_year) values (734, 'Toyota', 'Tundra', 2004);
insert into car (id, make, model, model_year) values (735, 'Oldsmobile', '98', 1993);
insert into car (id, make, model, model_year) values (736, 'BMW', 'M5', 2007);
insert into car (id, make, model, model_year) values (737, 'Audi', 'A8', 2002);
insert into car (id, make, model, model_year) values (738, 'GMC', 'Canyon', 2004);
insert into car (id, make, model, model_year) values (739, 'Lamborghini', 'Murciélago', 2003);
insert into car (id, make, model, model_year) values (740, 'Dodge', 'Stealth', 1993);
insert into car (id, make, model, model_year) values (741, 'Scion', 'xA', 2006);
insert into car (id, make, model, model_year) values (742, 'GMC', 'Sierra 2500', 2012);
insert into car (id, make, model, model_year) values (988, 'Acura', 'Legend', 1995);
insert into car (id, make, model, model_year) values (989, 'Mercedes-Benz', 'SL-Class', 2009);
insert into car (id, make, model, model_year) values (990, 'Chevrolet', 'Silverado 3500', 2012);
insert into car (id, make, model, model_year) values (991, 'Ford', 'E-Series', 1994);
insert into car (id, make, model, model_year) values (992, 'Mazda', 'Mazdaspeed 3', 2007);
insert into car (id, make, model, model_year) values (993, 'Spyker', 'C8 Spyder', 2004);
insert into car (id, make, model, model_year) values (994, 'Ford', 'Thunderbird', 2006);
insert into car (id, make, model, model_year) values (995, 'Subaru', 'Justy', 1993);
insert into car (id, make, model, model_year) values (996, 'Subaru', 'Alcyone SVX', 1994);
insert into car (id, make, model, model_year) values (997, 'Ford', 'LTD Crown Victoria', 1985);
insert into car (id, make, model, model_year) values (998, 'Subaru', 'Legacy', 1994);
insert into car (id, make, model, model_year) values (999, 'Mitsubishi', 'Mirage', 1995);
insert into car (id, make, model, model_year) values (1000, 'Buick', 'Skylark', 1997);

CREATE TABLE IF NOT EXISTS expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    expense_name varchar(20),
    expense_total INT
);
INSERT INTO expenses (expense_name, expense_total) VALUES
('salaries', 5000),
('supplies', 3000),
('taxes', 7000),
('Insurance', 3500),
('Equipment', 6000),
('Software', 4500);

-- RANDOM 값 생성; +1을 안하면 0이 나올 수 있음
-- 고객 수에 따라 랜덤하게 customer_id를 설정
UPDATE car SET car.customer_id = FLOOR(RAND()* (SELECT COUNT(*) FROM customers) + 1);

-- FLOOR(i + RAND() * (J - I); -- I ~ J: I,J 포함 정수
UPDATE car SET customer_id =  floor(4 + rand() * (14 - 4) );
update car set customer_id =  floor(4 + rand() * ((SELECT COUNT(*) FROM customers) - 3) );

-- 중복 제거 make, model, model_year 조합
DELETE FROM car WHERE id NOT IN (SELECT MIN(id) FROM car GROUP BY make, model, model_year);
-- 특정 개수를 남기기
-- 예시: 각 모델별로 3개만 남기기
DELETE c1
  FROM car c1
  JOIN car c2
  ON c1.model = c2.model
  WHERE c1.id < (c2.id + 3);

