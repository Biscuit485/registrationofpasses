package com.company.registrationofpasses.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Employee;

@UiController("registrationofpasses_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}