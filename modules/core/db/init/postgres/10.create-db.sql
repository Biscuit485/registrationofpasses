<<<<<<< HEAD
-- begin REGISTRATIONOFPASSES_PLACE_WORK
create table REGISTRATIONOFPASSES_PLACE_WORK (
=======
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
    PLACEWORK uuid,
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_EMPLOYEE
>>>>>>> entity
-- begin REGISTRATIONOFPASSES_PHONE
create table REGISTRATIONOFPASSES_PHONE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBERPHONE varchar(255),
    TYPEPHONE varchar(50),
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_PHONE
-- begin REGISTRATIONOFPASSES_PLACE_RESIDENCE
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
    TYPEADDRESS varchar(50),
    --
    primary key (ID)
)^
-- end REGISTRATIONOFPASSES_PLACE_RESIDENCE
-- begin REGISTRATIONOFPASSES_PLACE_WORK
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
)^
-- end REGISTRATIONOFPASSES_PLACE_WORK
