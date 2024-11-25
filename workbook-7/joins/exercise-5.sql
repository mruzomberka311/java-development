USE northwind;

-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName 
FROM products p 
INNER JOIN categories c ON p.CategoryID = c.CategoryID
ORDER BY CategoryName, ProductName;

-- Question 2
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM products p
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice >= 75
ORDER BY ProductName;

-- Question 3
SELECT p.ProductID, p.ProductName, p.UnitPrice,c.CategoryName, s.CompanyName  
FROM products p
INNER JOIN categories c ON p.CategoryID = c.CategoryID 
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;

-- Question 4 
SELECT p.ProductName, c.* 
FROM products p
INNER JOIN categories c ON p.CategoryID = c.CategoryID
WHERE UnitPrice = (SELECT MAX(UnitPrice)
		FROM products p);
        
-- Question 5 
SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName
FROM orders o 
INNER JOIN shippers s ON o.ShipVia = s.ShipperID 
WHERE o.ShipCountry = "Germany";

-- Question 6 
SELECT o.OrderID,o.OrderDate, o.ShipName, o.ShipAddress
FROM orders o 
INNER JOIN orderdetails od ON o.OrderID = od.OrderID 
INNER JOIN products p ON p.ProductID = od.ProductID
WHERE p.ProductName = 'Sasquatch Ale';
			