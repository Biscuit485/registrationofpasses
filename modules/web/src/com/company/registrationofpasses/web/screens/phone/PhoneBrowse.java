package com.company.registrationofpasses.web.screens.phone;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Phone;

@UiController("registrationofpasses_Phone.browse")
@UiDescriptor("phone-browse.xml")
@LookupComponent("phonesTable")
@LoadDataBeforeShow
public class PhoneBrowse extends StandardLookup<Phone> {
}