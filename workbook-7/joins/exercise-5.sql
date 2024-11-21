USE northwind;

-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName 
FROM products p 
INNER JOIN categories c ON p.CategoryID = c.CategoryID
ORDER BY CategoryName, ProductName;

-- Question 2
SELECT * 
FROM suppliers;

SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM products p
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
WHERE UnitPrice >= 75
ORDER BY ProductName;

-- Question 3
SELECT p.ProductID, p.ProductName, p.UnitPrice,c.CategoryName, s.SupplierName  
FROM products p
INNER JOIN categories c ON (p.CategoryID = c.CategoryID) INNER JOIN suppliers s ON (p.SupplierID = s.SupplierID);


-- Question 4 

