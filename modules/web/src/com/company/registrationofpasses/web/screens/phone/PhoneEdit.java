package com.company.registrationofpasses.web.screens.phone;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Phone;

@UiController("registrationofpasses_Phone.edit")
@UiDescriptor("phone-edit.xml")
@EditedEntityContainer("phoneDc")
@LoadDataBeforeShow
public class PhoneEdit extends StandardEditor<Phone> {
}