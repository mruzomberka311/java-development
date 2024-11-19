USE northwind;
-- Question 1
-- products
SELECT * 
FROM products;

-- Question 2
SELECT ProductID, ProductName, UnitPrice
FROM products;

-- Question 3
SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice;

-- Question 4
SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice <= 7.50;

-- Question 5
SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitsInStock DESC;

-- Question 6
SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName;

-- Question 7
SELECT ProductId, ProductName, UnitsInStock, UnitsOnOrder 
FROM products
WHERE UnitsInStock = 0 AND UnitsOnOrder >= 1;

-- Question 8
-- categories

-- Question 9
SELECT * 
FROM categories;
-- categoryID of seafood is 8

-- Question 10
SELECT * 
FROM products
WHERE categoryId = 8;

-- Question 11
SELECT LastName, FirstName
FROM employees;

-- Question 12
SELECT LastName, FirstName, Title
FROM employees
WHERE Title LIKE "%Manager%";

-- Question 13
SELECT DISTINCT Title 
FROM employees;

-- Question 14
SELECT LastName, FirstName, Salary
FROM employees
WHERE Salary BETWEEN 2000 AND 2500;

-- Question 15
SELECT * 
FROM suppliers;

-- Question 16
SELECT SupplierID, CompanyName 
FROM suppliers
WHERE CompanyName = "Tokyo Traders";

SELECT *
FROM products;

SELECT ProductName, SupplierId
FROM products
WHERE SupplierID = 4;