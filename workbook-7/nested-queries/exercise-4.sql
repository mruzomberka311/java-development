USE northwind;

-- Question 1
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice) 
				   FROM products);
                   
-- Question 2
SELECT OrderID, ShipName, ShipAddress 
FROM orders
WHERE ShipVia = (SELECT ShipperID
				 FROM shippers
				 WHERE CompanyName LIKE "%Federal%");
                    
-- Question 3
SELECT OrderID 
FROM orderdetails
WHERE ProductID = (SELECT ProductID 
					FROM products
					WHERE ProductName LIKE "%Sasquatch%");
                    
-- Question 4
SELECT EmployeeID, LastName, FirstName
FROM Employees
WHERE EmployeeID =  (SELECT EmployeeID 
					FROM orders
					WHERE OrderID = 10266);
                    
-- Question 5
SELECT CustomerID, ContactName
FROM customers
WHERE CustomerID IN (SELECT CustomerID
					FROM orders
					WHERE OrderID = 10266);