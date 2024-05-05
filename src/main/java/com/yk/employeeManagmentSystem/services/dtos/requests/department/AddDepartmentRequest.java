package com.yk.employeeManagmentSystem.services.dtos.requests.department;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddDepartmentRequest {

    @NotBlank(message = "This area can't be empty")
    @Size(min = 2, max = 50, message = "This entry must be between 2 and 5")
    private String departmentName;
}
