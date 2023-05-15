-- begin REGISTRATIONOFPASSES_EMPLOYEE
create table REGISTRATIONOFPASSES_EMPLOYEE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MIDDLENAME varchar(255),
    FIRSTNAME varchar(255),
    LASTNAME varchar(255),
    DATEBIRTH date,
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_EMPLOYEE
