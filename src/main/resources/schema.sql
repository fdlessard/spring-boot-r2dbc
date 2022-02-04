CREATE TABLE IF NOT EXISTS customer (
  id SERIAL PRIMARY KEY,
  lastName VARCHAR(25) NOT NULL,
  firstName VARCHAR(25) NOT NULL,
  company VARCHAR(25) NOT NULL
);

INSERT INTO customer(id, lastName, firstName, company) values (0, 'last-name-0', 'first-name-0', 'company-0' );
INSERT INTO customer(id, lastName, firstName, company) values (1, 'last-name-1', 'first-name-1', 'company-1');
