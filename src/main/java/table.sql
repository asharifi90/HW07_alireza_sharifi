CREATE TABLE IF NOT EXISTS writer(
   id SERIAL PRIMARY KEY,
   first_name VARCHAR(255),
    last_name VARCHAR(255),
    age int,
    book_list VARCHAR[]
    );