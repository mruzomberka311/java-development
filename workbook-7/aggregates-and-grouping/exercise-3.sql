USE northwind;

-- Question 1
SELECT COUNT(CompanyName) 
FROM suppliers;

-- Question 2
SELECT SUM(Salary)
FROM employees;

-- Question 3
SELECT  MIN(UnitPrice)
FROM products;

-- Question 4
SELECT AVG(UnitPrice)
FROM products;

-- Question 5 
SELECT MAX(UnitPrice)
FROM products;

-- Question 6
SELECT SupplierID, COUNT(UnitsInStock) 
FROM products
GROUP BY SupplierID;


-- Question 7
SELECT CategoryId, AVG(UnitPrice) 
FROM products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(UnitsInStock) 
FROM products
GROUP BY SupplierID HAVING COUNT(UnitsInStock) >= 5;

-- Question 9
SELECT ProductID, ProductName, (UnitPrice * UnitsInStock) AS Results
FROM products
ORDER BY Results;
