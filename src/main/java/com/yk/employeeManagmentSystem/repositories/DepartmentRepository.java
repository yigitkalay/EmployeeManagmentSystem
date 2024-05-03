package com.yk.employeeManagmentSystem.repositories;

import com.yk.employeeManagmentSystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
