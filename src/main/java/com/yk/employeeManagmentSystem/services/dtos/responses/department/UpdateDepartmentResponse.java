package com.yk.employeeManagmentSystem.services.dtos.responses.department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDepartmentResponse {
    private int id;
    private String departmentName;
}
