drop table if exists categories;
CREATE TABLE Categories(
Category_Id INT PRIMARY KEY,
Category_Name VARCHAR(20)
);

INSERT INTO Categories (Category_Id, Category_Name) VALUES
(1, 'Car'),
(2, 'Vegetable'),
(3, 'Utitity'),
(4, 'Electronics'),
(5, 'Clothing'),
(6, 'Furniture'),
(7, 'Books'),
(8, 'Toys'),
(9, 'Sports Equipment'),
(10, 'Beauty Products');

select * from categories;