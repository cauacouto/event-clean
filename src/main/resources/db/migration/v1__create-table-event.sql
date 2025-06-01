--v1__create-table-event.sql
create table events(

    id bigint not null  primary key,
    name varchar(255) not null,
    description TEXT ,
    identifier varchar(255) not null unique,
    date_inicial timestamp not null,
    date_End timestamp not null,
    local_event varchar(255) not null,
    organizer varchar(255) not null,
    capacity integer not null,
    tipo_Event varchar(50) not null

);