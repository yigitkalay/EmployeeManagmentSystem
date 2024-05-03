package com.yk.employeeManagmentSystem.services.concrete;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.repositories.EmployeeRepository;
import com.yk.employeeManagmentSystem.services.abstracts.EmployeeService;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import com.yk.employeeManagmentSystem.services.mappers.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public AddEmployeeResponse add(AddEmployeeRequest request) {

        //Manuel Mapping
        /*
        //Request
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setSurname(request.getSurname());
        //Response
        Employee response=employeeRepository.save(employee);
        AddEmployeeResponse response1=new AddEmployeeResponse();
        response1.setId(response.getId());
        response1.setName(response.getName());
        response1.setSurname(response.getSurname());*/

        Employee employee= EmployeeMapper.INSTANCE.employeeFromRequest(request);
        AddEmployeeResponse response = EmployeeMapper.INSTANCE.employeeFromResponse(employeeRepository.save(employee));
        return response;
    }

    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
