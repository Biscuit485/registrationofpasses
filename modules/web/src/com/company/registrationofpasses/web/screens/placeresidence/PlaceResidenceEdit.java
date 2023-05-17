package com.company.registrationofpasses.web.screens.placeresidence;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.PlaceResidence;

@UiController("registrationofpasses_PlaceResidence.edit")
@UiDescriptor("place-residence-edit.xml")
@EditedEntityContainer("placeResidenceDc")
@LoadDataBeforeShow
public class PlaceResidenceEdit extends StandardEditor<PlaceResidence> {
}