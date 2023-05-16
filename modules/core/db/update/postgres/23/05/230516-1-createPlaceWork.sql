create table REGISTRATIONOFPASSES_PLACE_WORK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PLACEWORK varchar(255),
    POST varchar(255),
    --
    primary key (ID)
);