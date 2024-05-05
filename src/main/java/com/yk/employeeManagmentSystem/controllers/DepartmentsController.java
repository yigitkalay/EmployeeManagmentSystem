package com.yk.employeeManagmentSystem.controllers;

import com.yk.employeeManagmentSystem.services.abstracts.DepartmentService;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.AddDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.UpdateDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.AddDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.GetDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.UpdateDepartmentResponse;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentsController {
    private final DepartmentService departmentService;

    @GetMapping("getAll")
    public List<GetDepartmentResponse> getAll() {
        return departmentService.getAll();
    }

    @GetMapping("{id}")
    public GetDepartmentResponse getById(@PathVariable int id) {
        return departmentService.getById(id);
    }

    @PostMapping()
    public ResponseEntity<AddDepartmentResponse> add(@RequestBody @Valid AddDepartmentRequest request) {
        AddDepartmentResponse response = departmentService.add(request);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();

        return ResponseEntity.created(location).body(response);
    }

    @PutMapping()
    public UpdateDepartmentResponse update(@RequestBody @Valid UpdateDepartmentRequest request) {
        return departmentService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        departmentService.delete(id);
    }

}
