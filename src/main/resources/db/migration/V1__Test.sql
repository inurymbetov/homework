create sequence hibernate_sequence start with 1 increment by 1;

create table words (
    id      int auto_increment,
    value   varchar(255)
);

insert into words(id, value) values (1, 'lorem ipsum'); -- какой-то текст