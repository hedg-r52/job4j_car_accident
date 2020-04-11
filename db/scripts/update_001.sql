create table if not exists accidents (
    id serial primary key not null,
    name varchar,
    text varchar,
    address varchar
);

insert into accidents(name, text, address)
values
    ('name one', 'text one', 'address one'),
    ('name two', 'text two', 'address two');