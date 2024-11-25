USE northwind;
-- Question 1
INSERT INTO suppliers(SupplierID,CompanyName, ContactName)
VALUES (2210, TestCo ,Test);
SELECT *
FROM suppliers;
-- Question 2


-- Question 3
SELECT * 
FROM suppliers s
INNER JOIN products p ON s.SupplierID = p.SupplierID

-- Question 4
UPDATE 