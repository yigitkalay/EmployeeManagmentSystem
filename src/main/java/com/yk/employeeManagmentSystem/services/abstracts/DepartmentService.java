package com.yk.employeeManagmentSystem.services.abstracts;

import com.yk.employeeManagmentSystem.entities.Department;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.AddDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.UpdateDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.AddDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.GetDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.UpdateDepartmentResponse;

import java.util.List;

public interface DepartmentService {
    AddDepartmentResponse add(AddDepartmentRequest department);
    UpdateDepartmentResponse update(UpdateDepartmentRequest department);
    void delete(int id);
    List<GetDepartmentResponse> getAll();
    GetDepartmentResponse getById(int id);
}
