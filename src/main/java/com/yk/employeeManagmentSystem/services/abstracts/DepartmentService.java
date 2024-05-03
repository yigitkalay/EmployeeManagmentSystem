package com.yk.employeeManagmentSystem.services.abstracts;

import com.yk.employeeManagmentSystem.entities.Department;

import java.util.List;

public interface DepartmentService {
    void add(Department department);
    void update(Department department);
    void delete(int id);
    List<Department> get();
    Department getById(int id);
}
