create table users(
    id bigint GENERATED BY DEFAULT AS IDENTITY not null primary key,
    email varchar not null,
    first_name varchar,
    last_name varchar
);