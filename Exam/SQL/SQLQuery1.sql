Use master
go
create database Exam
go
use Exam
go
CREATE TABLE suppliers (
  id int NOT NULL PRIMARY KEY IDENTITY(1,1),  -- Auto-incrementing integer primary key
  name nvarchar(255) NOT NULL,  -- Supplier name (variable length string up to 255 characters)
  address nvarchar(255),        -- Supplier address (variable length string up to 255 characters)
  phone nvarchar(50),           -- Supplier phone number (variable length string up to 50 characters)
  email nvarchar(255)           -- Supplier email address (variable length string up to 255 characters)
);
go
INSERT INTO suppliers (name, address, phone, email)
VALUES ('Acme Corp', '123 Main St, Anytown, CA 12345', '555-555-1212', 'sales@acmecorp.com');

INSERT INTO suppliers (name, address, phone, email)
VALUES ('Brick & Bolt Supplies', '456 Elm St, Springfield, NY 54321', '800-555-3232', 'info@brickandbolt.com');

INSERT INTO suppliers (name, address, phone, email)
VALUES ('TechTronics', '789 Silicon Valley Blvd, San Jose, CA 98765', '408-555-3232', 'support@techtronics.com');

INSERT INTO suppliers (name, address, phone, email)
VALUES ('Global Papers', '100 Recycled Way, Seattle, WA 09876', '206-666-3333', 'orders@globalpapers.net');

INSERT INTO suppliers (name, address, phone, email)
VALUES ('Office Supply Haven', '321 Office Park Dr, Miami, FL 33123', '305-555-7373', 'contact@officeplus.com');
