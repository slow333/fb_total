drop table if exists car;
CREATE table IF NOT EXISTS car (
	car_id INT AUTO_INCREMENT PRIMARY KEY,
	make VARCHAR(50),
	model VARCHAR(50),
	model_year VARCHAR(50)
);
insert into car (car_id, make, model, model_year) values (1, 'Ford', 'Ranger', 1985);
insert into car (car_id, make, model, model_year) values (2, 'Chevrolet', 'Blazer', 1998);
insert into car (car_id, make, model, model_year) values (3, 'Nissan', 'Frontier', 2012);
insert into car (car_id, make, model, model_year) values (4, 'Ford', 'LTD Crown Victoria', 1986);
insert into car (car_id, make, model, model_year) values (5, 'Chevrolet', 'Suburban 1500', 1998);
insert into car (car_id, make, model, model_year) values (6, 'Dodge', 'Neon', 2002);
insert into car (car_id, make, model, model_year) values (7, 'Geo', 'Metro', 1996);
insert into car (car_id, make, model, model_year) values (8, 'GMC', 'Sierra 3500', 2003);
insert into car (car_id, make, model, model_year) values (9, 'Nissan', 'Altima', 2012);
insert into car (car_id, make, model, model_year) values (10, 'Toyota', 'Camry', 2005);
insert into car (car_id, make, model, model_year) values (11, 'Honda', 'Civic', 2008);
insert into car (car_id, make, model, model_year) values (724, 'Chrysler', 'Town & Country', 2012);
insert into car (car_id, make, model, model_year) values (725, 'Volkswagen', 'Beetle', 1965);
insert into car (car_id, make, model, model_year) values (726, 'Mitsubishi', 'Pajero', 1987);
insert into car (car_id, make, model, model_year) values (727, 'Chevrolet', 'Corvette', 2011);
insert into car (car_id, make, model, model_year) values (728, 'Dodge', 'Ram', 2010);
insert into car (car_id, make, model, model_year) values (729, 'Subaru', 'Outback', 2012);
insert into car (car_id, make, model, model_year) values (730, 'Lexus', 'ES', 1991);
insert into car (car_id, make, model, model_year) values (731, 'Audi', 'S8', 2006);
insert into car (car_id, make, model, model_year) values (732, 'Infiniti', 'EX', 2009);
insert into car (car_id, make, model, model_year) values (733, 'Pontiac', 'Grand Am', 2000);
insert into car (car_id, make, model, model_year) values (734, 'Toyota', 'Tundra', 2004);
insert into car (car_id, make, model, model_year) values (735, 'Oldsmobile', '98', 1993);
