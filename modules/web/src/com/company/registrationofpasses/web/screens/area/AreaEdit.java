package com.company.registrationofpasses.web.screens.area;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Area;

@UiController("registrationofpasses_Area.edit")
@UiDescriptor("area-edit.xml")
@EditedEntityContainer("areaDc")
@LoadDataBeforeShow
public class AreaEdit extends StandardEditor<Area> {
}