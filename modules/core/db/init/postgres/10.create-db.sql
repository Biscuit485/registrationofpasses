<<<<<<< HEAD
-- begin REGISTRATIONOFPASSES_PLACE_WORK
create table REGISTRATIONOFPASSES_PLACE_WORK (
=======
-- begin REGISTRATIONOFPASSES_EMPLOYEE
create table REGISTRATIONOFPASSES_EMPLOYEE (
>>>>>>> entity
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
    PLACEWORK varchar(255),
    POST varchar(255),
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_PLACE_WORK
=======
    MIDDLENAME varchar(255),
    FIRSTNAME varchar(255),
    LASTNAME varchar(255),
    DATEBIRTH date,
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_EMPLOYEE
>>>>>>> entity