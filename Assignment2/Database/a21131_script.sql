USE master
GO
CREATE DATABASE A21131_Assignment2;
GO
USE A21131_Assignment2;
GO
CREATE TABLE Shippers (
  ShipperID int PRIMARY KEY IDENTITY(1, 1),
  CompanyName nvarchar(40) NOT NULL,
  Phone nvarchar(24) NULL
);
GO
INSERT INTO Shippers(CompanyName, Phone) VALUES (N'Speedy Express', N'(503) 555-9831');
INSERT INTO Shippers(CompanyName, Phone) VALUES (N'United Package', N'(503) 555-3199');
INSERT INTO Shippers(CompanyName, Phone) VALUES (N'Federal Shipping', N'(503) 555-9931');
INSERT INTO Shippers(CompanyName, Phone) VALUES (N'Speedy Express', N'(503) 555-9831');
DELETE FROM Shippers
WHERE ShipperID = 4;
INSERT INTO Shippers(CompanyName, Phone) VALUES (N'Uber', N'(503) 555-9999');

