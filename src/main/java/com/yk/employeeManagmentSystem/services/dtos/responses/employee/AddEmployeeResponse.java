package com.yk.employeeManagmentSystem.services.dtos.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AddEmployeeResponse {
    private int id;
    private String name;
    private String surname;
}
