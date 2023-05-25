create table REGISTRATIONOFPASSES_REQUEST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE uuid,
    TYPEPASS varchar(50),
    TYPEREASON varchar(50),
    --
    primary key (ID)
);