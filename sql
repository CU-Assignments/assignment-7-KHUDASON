CREATE DATABASE testdb;
USE testdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

INSERT INTO users (name) VALUES ('Alice'), ('Bob');
