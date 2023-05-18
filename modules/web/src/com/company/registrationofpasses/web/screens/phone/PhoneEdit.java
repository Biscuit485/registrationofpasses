package com.company.registrationofpasses.web.screens.phone;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.MaskedField;
import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Phone;

import javax.inject.Inject;

@UiController("registrationofpasses_Phone.edit")
@UiDescriptor("phone-edit.xml")
@EditedEntityContainer("phoneDc")
@LoadDataBeforeShow
public class PhoneEdit extends StandardEditor<Phone> {
    @Inject
    private MaskedField numberPhoneField;
    @Inject
    private Notifications notifications;

}