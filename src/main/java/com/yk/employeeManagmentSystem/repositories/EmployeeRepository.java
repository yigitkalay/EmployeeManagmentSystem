package com.yk.employeeManagmentSystem.repositories;

import com.yk.employeeManagmentSystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
