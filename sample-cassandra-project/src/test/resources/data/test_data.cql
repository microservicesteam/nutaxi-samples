CREATE TABLE users (
  user_id int PRIMARY KEY,
  fname text,
  lname text
);

INSERT INTO users (user_id,  fname, lname)
  VALUES (1, 'Han', 'Solo');
  
 CREATE INDEX ON users (lname);