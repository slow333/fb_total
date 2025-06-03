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