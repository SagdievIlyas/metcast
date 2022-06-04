create table temperature (
    id                  serial              not null,
    temperature         numeric (19, 2)     not null,
    latitude            numeric (19, 2)     not null,
    longitude           numeric (19, 2)     not null,
    timezone            varchar             not null,
    weather_datetime    timestamp           not null,
    request_datetime    timestamp           not null
);

alter table temperature add constraint pk_temperature primary key (id);


create table wind (
     id                         serial              not null,
     speed_meters_per_seconds   numeric (19, 2)     not null,
     latitude                   numeric (19, 2)     not null,
     longitude                  numeric (19, 2)     not null,
     timezone                   varchar             not null,
     weather_datetime           timestamp           not null,
     request_datetime           timestamp           not null
);

alter table wind add constraint pk_wind primary key (id);