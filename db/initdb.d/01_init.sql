CREATE TABLE items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price NUMERIC(6, 2) NOT NULL
);

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    status VARCHAR(50) DEFAULT 'PENDING',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE order_items (
	id SERIAL PRIMARY KEY,
    order_id INT REFERENCES orders(id) ON DELETE CASCADE,
    item_id INT REFERENCES items(id),
    quantity INT NOT NULL
);

INSERT INTO items (name, price) VALUES 
('Burger', 8.99),
('Pomfrit', 6.7),
('CocaCola', 6.9),
('Ražnjići', 4.20);

INSERT INTO orders (customer_name, status) VALUES
('Petar Petrovic', 'COOKING'),
('Marko Markovic', 'PENDING'),
('Stefan Stefic', 'READY');
INSERT INTO order_items (order_id, item_id, quantity) VALUES
(1, 1, 1),
(1, 2, 2),
(2, 1, 1),
(2, 3, 1),
(3, 3, 3);