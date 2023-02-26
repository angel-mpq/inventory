CREATE TABLE product (
 brand_id       INT NOT NULL,
 start_date     TIMESTAMP NOT NULL,
 end_date       TIMESTAMP,
 price_list     INT NOT NULL,
 product_id     INT NOT NULL,
 priority       INT NOT NULL,
 price          REAL NOT NULL,
 curr           VARCHAR(6) NOT NULL
);

INSERT INTO product (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES (1, '2020-06-14 00:00:00.000', '2020-12-31 23:59:59.999', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO product (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES (1, '2020-06-14 15:00:00.000', '2020-06-14 18:30:00.999', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO product (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES (1, '2020-06-15 00:00:00.000', '2020-06-15 11:00:00.999', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO product (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES (1, '2020-06-15 16:00:00.000', '2020-12-31 23:59:59.999', 4, 35455, 1, 38.95, 'EUR');