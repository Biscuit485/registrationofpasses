package com.company.registrationofpasses.web.screens.placework;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.PlaceWork;

@UiController("registrationofpasses_PlaceWork.browse")
@UiDescriptor("place-work-browse.xml")
@LookupComponent("placeWorksTable")
@LoadDataBeforeShow
public class PlaceWorkBrowse extends StandardLookup<PlaceWork> {
}