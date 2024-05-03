package com.yk.employeeManagmentSystem.services.abstracts;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    AddEmployeeResponse add(AddEmployeeRequest employee);
    void update(Employee employee);
    void delete(int id);
    List<Employee> getAll();
    Employee getById(int id);
}
