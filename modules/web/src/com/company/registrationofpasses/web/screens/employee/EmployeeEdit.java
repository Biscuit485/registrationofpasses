package com.company.registrationofpasses.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.registrationofpasses.entity.Employee;

@UiController("registrationofpasses_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}