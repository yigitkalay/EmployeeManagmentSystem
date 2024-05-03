package com.yk.employeeManagmentSystem.services.abstracts;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.UpdateEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.GetEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.UpdateEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    AddEmployeeResponse add(AddEmployeeRequest employee);
    UpdateEmployeeResponse update(UpdateEmployeeRequest employee);
    void delete(int id);
    List<GetEmployeeResponse> getAll();
    GetEmployeeResponse getById(int id);
}
