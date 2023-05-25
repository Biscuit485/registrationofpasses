create table REGISTRATIONOFPASSES_AREA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBERAREA varchar(255),
    BUILDING varchar(255),
    --
    primary key (ID)
);