CREATE TABLE IF NOT EXISTS author(
   id SERIAL PRIMARY KEY,
   first_name VARCHAR(255),
    last_name VARCHAR(255),
    age int,
    book_list VARCHAR[]
    );

CREATE TABLE IF NOT EXISTS book(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    year int,
    writer VARCHAR(255),
    author_id INTEGER REFERENCES author(id)
);