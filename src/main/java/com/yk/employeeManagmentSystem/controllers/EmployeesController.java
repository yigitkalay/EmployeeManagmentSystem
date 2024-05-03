package com.yk.employeeManagmentSystem.controllers;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeesController {

    private final EmployeeRepository employeeRepository;

    /*@GetMapping()
    public String get(@RequestParam String name){
        return "Merhaba"+name;
    }*/

    @GetMapping()
    public List<Employee> get(){
        return employeeRepository.findAll();
    }
}
