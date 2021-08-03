CREATE DATABASE Assignment_sql2;
USE Assignment_sql2;

DROP TABLE IF EXISTS Categories;
CREATE TABLE Categories(
      CategoryID INT,
      CategoryName VARCHAR(255),
      Description VARCHAR(255),
      PRIMARY KEY(CategoryID));

INSERT INTO Categories VALUES(1, 'Beverages', 'Soft drinks, coffees, teas, beers, and ales');
INSERT INTO Categories VALUES(2, 'Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings');
INSERT INTO Categories VALUES(3, 'Confections', 'Desserts, candies, and sweet breads ');
INSERT INTO Categories VALUES(4, 'Dairy Products', 'Cheeses');
INSERT INTO Categories VALUES(5, 'Grains/Cereals', 'Breads, crackers, pasta, and cereal');



DROP TABLE IF EXISTS Products;
CREATE TABLE Products(
      ProductID INT,
      ProductName VARCHAR(255),
      SupplierID INT,
      CategoryID INT,
      Unit INT,
      Price INT,
      PRIMARY KEY (ProductID),
      FOREIGN KEY (CategoryID) REFERENCES Categories (CategoryID));

INSERT INTO Products VALUES(1, 'Chais', 1, 1, 200, 18);
INSERT INTO Products VALUES(2, 'Chang', 1, 1, 120, 19);
INSERT INTO Products VALUES(3, 'Aniseed Syrup', 1, 2, 50, 10);
INSERT INTO Products VALUES(4, "Chef Anton's Cajun Seasoning", 2, 2, 45, 22);
INSERT INTO Products VALUES(5, "Chef Anton's Gumbo Mix", 2, 4, 65, 25);
INSERT INTO Products VALUES(6, "Grandma's Boysenberry Spread ", 3, 2, 78, 25);
INSERT INTO Products VALUES(7, "Uncle Bob's Organic Dried Pears ", 3, 3, 98, 30);
INSERT INTO Products VALUES(8, 'Northwoods Cranberry Sauce', 3, 2, 150, 40);
INSERT INTO Products VALUES(9, 'Mishi Kobe Niku', 4, 4, 230, 97);
INSERT INTO Products VALUES(10, 'Ikura', 4, 5, 45, 31);

-- 1) 
SELECT * FROM Products WHERE ProductName LIKE '%ch%';

-- 2) 
SELECT * FROM Products WHERE Price > (SELECT AVG(Price) FROM Products);

-- 3) 
SELECT Products.ProductName FROM Products INNER JOIN Categories ON Categories.CategoryID = Products.CategoryID WHERE
Categories.CategoryName = 'Condiments';

-- 4)
SELECT  Categories.CategoryID, Categories.CategoryName, COUNT(Products.CategoryID) FROM Categories INNER JOIN Products ON
Products.CategoryID = Categories.CategoryID GROUP BY Categories.CategoryID;

-- 5)
CREATE INDEX unit_index ON Products (Unit);