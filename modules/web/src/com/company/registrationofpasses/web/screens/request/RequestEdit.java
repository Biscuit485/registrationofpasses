package com.company.registrationofpasses.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Request;

@UiController("registrationofpasses_Request.edit")
@UiDescriptor("request-edit.xml")
@EditedEntityContainer("requestDc")
@LoadDataBeforeShow
public class RequestEdit extends StandardEditor<Request> {
}