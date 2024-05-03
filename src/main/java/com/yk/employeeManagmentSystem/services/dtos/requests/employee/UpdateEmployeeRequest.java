package com.yk.employeeManagmentSystem.services.dtos.requests.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private String birthCity;
    private String birthCountry;
    private String phoneNumber;
    private int departmentId;
}
