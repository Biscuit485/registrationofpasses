alter table REQUEST_AREA_LINK add constraint FK_REQARE_ON_REQUEST foreign key (REQUEST_ID) references REGISTRATIONOFPASSES_REQUEST(ID);
alter table REQUEST_AREA_LINK add constraint FK_REQARE_ON_AREA foreign key (AREA_ID) references REGISTRATIONOFPASSES_AREA(ID);