CREATE TABLE Suppliers (
    Supplier_ID INT PRIMARY KEY AUTO_INCREMENT,
    Supplier_Name VARCHAR(100) NOT NULL,
    Contact_Name VARCHAR(100),
    Address VARCHAR(255),
    City VARCHAR(50),
    PostalCode VARCHAR(20),
    Country VARCHAR(50));
);
INSERT INTO Suppliers (Supplier_Name, Contact_Name, Address, City, PostalCode, Country) VALUES
('Exotic Liquid', 'John Doe', '123 Elm St', 'Springfield', '12345', 'USA'),
('New Orleans Cajun Delights', 'Jane Smith', '456 Oak St', 'Shelbyville', '67890', 'USA'),
('Grandma Kellys Homestead', 'Jim Brown', '789 Pine St', 'Capital City', '54321', 'USA'),
('Tokyo Traders', 'Sakura Tanaka', '101 Cherry Blossom Ave', 'Tokyo', '100-0001', 'Japan'),
('Cooperativa de Quesos Tradicionales', 'Carlos Ruiz', '202 Avocado St', 'Madrid', '28001', 'Spain'),
('Exotic Liquid', 'John Doe', '123 Elm St', 'Springfield', '12345', 'USA'),
('New Orleans Cajun Delights', 'Jane Smith', '456 Oak St', 'Shelbyville', '67890', 'USA'),
('Grandma Kellys Homestead', 'Jim Brown', '789 Pine St', 'Capital City', '54321', 'USA'),
('Tokyo Traders', 'Sakura Tanaka', '101 Cherry Blossom Ave', 'Tokyo', '100-0001', 'Japan'),
('Cooperativa de Quesos Tradicionales', 'Carlos Ruiz', '202 Avocado St', 'Madrid', '28001', 'Spain'),
('Exotic Liquid', 'John Doe', '123 Elm St', 'Springfield', '12345', 'USA'),
('New Orleans Cajun Delights', 'Jane Smith', '456 Oak St', 'Shelbyville', '67890', 'USA'),
('Grandma Kellys Homestead', 'Jim Brown', '789 Pine St', 'Capital City', '54321', 'USA'),
('Tokyo Traders', 'Sakura Tanaka', '101 Cherry Blossom Ave', 'Tokyo', '100-0001', 'Japan'),
('Cooperativa de Quesos Tradicionales', 'Carlos Ruiz', '202 Avocado St', 'Madrid', '28001', 'Spain');