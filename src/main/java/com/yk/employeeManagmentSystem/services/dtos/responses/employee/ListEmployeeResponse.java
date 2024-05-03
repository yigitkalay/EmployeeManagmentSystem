package com.yk.employeeManagmentSystem.services.dtos.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListEmployeeResponse {
    private String name;
    private String surname;
    private String phoneNumber;
}
