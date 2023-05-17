package com.company.registrationofpasses.web.screens.placeresidence;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.PlaceResidence;

@UiController("registrationofpasses_PlaceResidence.browse")
@UiDescriptor("place-residence-browse.xml")
@LookupComponent("placeResidencesTable")
@LoadDataBeforeShow
public class PlaceResidenceBrowse extends StandardLookup<PlaceResidence> {
}