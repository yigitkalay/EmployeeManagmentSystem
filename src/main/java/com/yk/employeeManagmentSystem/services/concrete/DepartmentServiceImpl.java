package com.yk.employeeManagmentSystem.services.concrete;

import com.yk.employeeManagmentSystem.entities.Department;
import com.yk.employeeManagmentSystem.repositories.DepartmentRepository;
import com.yk.employeeManagmentSystem.services.abstracts.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public void add(Department department) {
        departmentRepository.save(department);
    }

    public void update(Department department) {
        departmentRepository.save(department);
    }

    public void delete(int id) {
        departmentRepository.deleteById(id);
    }

    public List<Department> get() {
        return departmentRepository.findAll();
    }

    public Department getById(int id) {
        return departmentRepository.findById(id).orElseThrow();
    }
}
