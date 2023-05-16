package com.company.registrationofpasses.web.screens.placework;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.PlaceWork;

@UiController("registrationofpasses_PlaceWork.edit")
@UiDescriptor("place-work-edit.xml")
@EditedEntityContainer("placeWorkDc")
@LoadDataBeforeShow
public class PlaceWorkEdit extends StandardEditor<PlaceWork> {
}