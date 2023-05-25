package com.company.registrationofpasses.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Request;

@UiController("registrationofpasses_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("requestsTable")
@LoadDataBeforeShow
public class RequestBrowse extends StandardLookup<Request> {
}