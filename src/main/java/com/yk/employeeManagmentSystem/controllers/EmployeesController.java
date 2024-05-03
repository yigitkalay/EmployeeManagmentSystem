package com.yk.employeeManagmentSystem.controllers;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.abstracts.EmployeeService;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.UpdateEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.GetEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.UpdateEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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

    @GetMapping("getAll")
    public List<GetEmployeeResponse> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("{id}")
    public GetEmployeeResponse getById(@PathVariable int id){
        return employeeService.getById(id);
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

    @PutMapping()
    public UpdateEmployeeResponse updateEmployee(@RequestBody UpdateEmployeeRequest request){
        return employeeService.update(request);
    }

    @DeleteMapping("{id}")
    public void deleteUpdate(@PathVariable int id){
        employeeService.delete(id);
    }



}
