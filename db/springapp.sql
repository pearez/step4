CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE offices (
  description varchar(255) PRIMARY KEY,
  ciudad varchar (255),
  totalExpenses INTEGER,
  balance INTEGER,
  address varchar(255)
);
CREATE INDEX offices_description ON offices(description);