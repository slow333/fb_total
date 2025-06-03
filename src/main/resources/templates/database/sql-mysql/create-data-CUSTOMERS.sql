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
alter table customers add column City VARCHAR(20);

update customers set city = 'Daejeon' where customer_id=1;
update customers set city = 'KwanJu' where customer_id=2;
update customers set city = 'LA' where customer_id=3;
update customers set city = 'Texas' where customer_id=4;
update customers set city = 'otawa' where customer_id=5;
update customers set city = 'Campella' where customer_id=6;
update customers set city = 'Mexico city' where customer_id=7;
update customers set city = 'Bogota' where customer_id=8;
update customers set city = 'Copenhagen' where customer_id=8;
update customers set city = 'London' where customer_id=10;

update customers set country = 'Canada' where customer_id=5;
update customers set country = 'Uganda' where customer_id=6;
update customers set country = 'Mexico' where customer_id=7;
update customers set country = 'Collumbia' where customer_id=8;
update customers set country = 'Denmark' where customer_id=9;
update customers set country = 'England' where customer_id=10;

