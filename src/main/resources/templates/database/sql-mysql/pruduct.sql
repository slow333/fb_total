CREATE TABLE product(id INT NOT NULL AUTO_INCREMENT,  
                     name VARCHAR(80) NOT NULL,
                     supplierID INT NOT NULL,
                     CategoryID INT NOT NULL,
                     Unit VARCHAR(100) NOT NULL,
                     Price DECIMAL(10, 2) NOT NULL,
                     PRIMARY KEY (id));
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Chais', 1, 1, '10 boxes x 20 bags', 10.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Chang', 3, 1, '24 - 12 oz bottles', 19.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Aniseed Syrup', 4, 2, '12 - 550 ml bottles', 10.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Chef Anton\'s Cajun Seasoning', 1, 2, '48 - 6 oz jars', 22.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Chef Anton\'s Gumbo Mix', 4, 2, '36 boxes x 12 oz', 21.35);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Grandma\'s Boysenberry Spread', 3, 2, '12 - 8 oz jars', 25.0); 
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Uncle Bob\'s Organic Dried Pears', 2, 7, '12 - 1 lb pkgs.', 30.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Northwoods Cranberry Sauce', 1, 2, '12 - 12 oz jars', 40.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Mishi Kobe Niku', 3, 6, '18 - 500 g pkgs.', 97.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Ikura', 5, 8, '12 - 200 ml jars', 31.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Queso Cabrales', 2, 4, '1 kg pkg.', 21.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Queso Manchego La Pastora', 1, 4, '10 - 500 g pkgs.', 38.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Konbu', 15, 8, '2 kg box', 6.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Tofu', 11, 7, '40 - 100 g pkgs.', 23.25);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Genen Shouyu', 5, 2, '24 - 250 ml bottles', 15.5);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Pavlova', 5, 3, '32 oz pkg.', 17.45);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Alice Mutton', 1, 6, '20 - 1 kg tins', 39.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Carnarvon Tigers', 5, 8, '16 kg box', 62.5);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Teatime Chocolate Biscuits', 2, 3, '10 boxes x 12 biscuits', 9.2);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Sir Rodney\'s Scones', 1, 3, '24 pkgs. x 12 scones', 9.5);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Gustaf\'s Knäckebröd', 2, 5, '24 - 500 g pkgs.', 21.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Tunnbröd', 1, 5, '30 pkgs. x 500 g', 9.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Guaraná Fantástica', 7, 1, '12 - 355 ml cans', 4.5);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Nuoc Cham', 7, 2, '24 - 250 ml bottles', 21.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Käsebrätlinge', 8, 6, '10 boxes x 12 pieces', 9.0);   
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Römerburger', 8, 4, '12 - 100 g pkgs.', 9.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Spegesild', 10, 8, '4 - 450 g glasses', 12.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Zaanse koeken', 5, 3, '12 boxes', 9.5);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Chocolade', 12, 3, '10 pkgs.', 12.75);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Maxilaku', 12, 3, '24 - 50 g pkgs.', 20.0);
INSERT INTO product (name, supplierID, CategoryID, Unit, Price) values('Valkoinen suklaa', 12, 3, '12 - 100 g bars', 16.25);
