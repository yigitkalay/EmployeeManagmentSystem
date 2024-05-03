package com.yk.employeeManagmentSystem.services.dtos.requests.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddEmployeeRequest {
    private String name;
    private String surname;
    private int departmentId;
}
