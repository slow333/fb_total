drop table if exists Products;
CREATE TABLE Products(
   Product_ID INT NOT NULL AUTO_INCREMENT,  
   Product_Name VARCHAR(80) NOT NULL,
   Unit VARCHAR(100) NOT NULL,
   Price DECIMAL(10, 2) NOT NULL,
   Supplier_ID INT,
   Category_ID INT NOT NULL,
   PRIMARY KEY (Product_ID),
   CONSTRAINT FK_SupplierID FOREIGN KEY (Supplier_ID)
      REFERENCES suppliers(Supplier_ID) 
      ON DELETE SET NULL,
   CONSTRAINT FK_CategoryID FOREIGN KEY (Category_ID)
      REFERENCES Categories(Category_ID) 
      ON DELETE CASCADE);

INSERT INTO Products (Product_Name, supplier_ID, Category_ID, Unit, Price) values
('Chais', 1, 1, '10 boxes x 20 bags', 10.0)
,('Chang', 3, 1, '24 - 12 oz bottles', 19.0)
,('Aniseed Syrup', 4, 2, '12 - 550 ml bottles', 10.0)
,('Chef Anton\'s Cajun Seasoning', 1, 2, '48 - 6 oz jars', 22.0)
,('Chef Anton\'s Gumbo Mix', 4, 2, '36 boxes x 12 oz', 21.35)
,('Grandma\'s Boysenberry Spread', 3, 2, '12 - 8 oz jars', 25.0)
,('Uncle Bob\'s Organic Dried Pears', 2, 7, '12 - 1 lb pkgs.', 30.0)
,('Northwoods Cranberry Sauce', 1, 2, '12 - 12 oz jars', 40.0)
,('Mishi Kobe Niku', 3, 6, '18 - 500 g pkgs.', 97.0)
,('Ikura', 5, 8, '12 - 200 ml jars', 31.0)
,('Queso Cabrales', 2, 4, '1 kg pkg.', 21.0)
,('Queso Manchego La Pastora', 1, 4, '10 - 500 g pkgs.', 38.0)
,('Konbu', 15, 8, '2 kg box', 6.0)
,('Tofu', 11, 7, '40 - 100 g pkgs.', 23.25)
,('Genen Shouyu', 5, 2, '24 - 250 ml bottles', 15.5)
,('Pavlova', 5, 3, '32 oz pkg.', 17.45)
,('Alice Mutton', 1, 6, '20 - 1 kg tins', 39.0)
,('Carnarvon Tigers', 5, 8, '16 kg box', 62.5)
,('Teatime Chocolate Biscuits', 2, 3, '10 boxes x 12 biscuits', 9.2)
,('Sir Rodney\'s Scones', 1, 3, '24 pkgs. x 12 scones', 9.5)
,('Gustaf\'s Knäckebröd', 2, 5, '24 - 500 g pkgs.', 21.0)
,('Tunnbröd', 1, 5, '30 pkgs. x 500 g', 9.0)
,('Guaraná Fantástica', 7, 1, '12 - 355 ml cans', 4.5)
,('Nuoc Cham', 7, 2, '24 - 250 ml bottles', 21.0)
,('Käsebrätlinge', 8, 6, '10 boxes x 12 pieces', 9.0)
,('Römerburger', 8, 4, '12 - 100 g pkgs.', 9.0)
,('Spegesild', 10, 8, '4 - 450 g glasses', 12.0)
,('Zaanse koeken', 5, 3, '12 boxes', 9.5)
,('Chocolade', 12, 3, '10 pkgs.', 12.75)
,('Maxilaku', 12, 3, '24 - 50 g pkgs.', 20.0)
,('Valkoinen suklaa', 12, 3, '12 - 100 g bars', 16.25);
