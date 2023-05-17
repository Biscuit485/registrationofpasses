create table REGISTRATIONOFPASSES_PLACE_RESIDENCE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REGION varchar(255),
    CITY varchar(255),
    SETTLEMENT varchar(255),
    STREET varchar(255),
    HOUSE varchar(255),
    CORPUS varchar(255),
    FLAT varchar(255),
    --
    primary key (ID)
);