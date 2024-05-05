package com.yk.employeeManagmentSystem.repositories;

import com.yk.employeeManagmentSystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Optional<Department> findByDepartmentNameIgnoreCase(String departmentName);
}
