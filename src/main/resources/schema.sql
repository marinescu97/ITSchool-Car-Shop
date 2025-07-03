DROP TABLE IF EXISTS products;

CREATE TABLE IF NOT EXISTS products(
    id SERIAL PRIMARY KEY,
    brand VARCHAR(100),
    model VARCHAR(100),
    colour VARCHAR(100),
    capacity INTEGER,
    price NUMERIC(10, 2),
    year_of_manufacture DATE,
    discount NUMERIC(5, 2)
);