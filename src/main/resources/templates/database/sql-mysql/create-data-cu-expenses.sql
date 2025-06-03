DROP TABLE IF EXISTS expenses;
CREATE TABLE IF NOT EXISTS expenses (
   expense_id INT AUTO_INCREMENT PRIMARY KEY,
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
