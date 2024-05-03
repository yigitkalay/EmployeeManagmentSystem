package com.yk.employeeManagmentSystem.controllers;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.abstracts.EmployeeService;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeesController {

    private final EmployeeService employeeService;

    /*@GetMapping()
    public String get(@RequestParam String name){
        return "Merhaba"+name;
    }*/

    @GetMapping()
    public List<Employee> getEmployee(){
        return employeeService.getAll();
    }

    @PostMapping()
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<AddEmployeeResponse> addEmployee(@RequestBody AddEmployeeRequest request){

        AddEmployeeResponse response= employeeService.add(request);
        URI location= ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("/{id}").
                buildAndExpand(response.getId()).
                toUri();
        //URI location = URI.create("/api/employees/"+response.getId());
        return ResponseEntity.created(location).body(response);
    }
}
