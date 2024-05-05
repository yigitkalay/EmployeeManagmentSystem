package com.yk.employeeManagmentSystem.services.dtos.requests.department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddDepartmentRequest {
    private String departmentName;
}
