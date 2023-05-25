package com.company.registrationofpasses.web.screens.area;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Area;

@UiController("registrationofpasses_Area.browse")
@UiDescriptor("area-browse.xml")
@LookupComponent("areasTable")
@LoadDataBeforeShow
public class AreaBrowse extends StandardLookup<Area> {
}