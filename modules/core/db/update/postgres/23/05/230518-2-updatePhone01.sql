alter table REGISTRATIONOFPASSES_PHONE add constraint FK_REGISTRATIONOFPASSES_PHONE_ON_EMPLOYEE foreign key (EMPLOYEE) references REGISTRATIONOFPASSES_EMPLOYEE(ID);
create index IDX_REGISTRATIONOFPASSES_PHONE_ON_EMPLOYEE on REGISTRATIONOFPASSES_PHONE (EMPLOYEE);
