package com.yk.employeeManagmentSystem.services.concrete;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.repositories.EmployeeRepository;
import com.yk.employeeManagmentSystem.services.abstracts.EmployeeService;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.UpdateEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.GetEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.UpdateEmployeeResponse;
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

        Employee employee= EmployeeMapper.INSTANCE.addRequestToEmployee(request);
        return EmployeeMapper.INSTANCE.employeeToAddResponse(employeeRepository.save(employee));
    }

    public UpdateEmployeeResponse update(UpdateEmployeeRequest request) {
        Employee employee = EmployeeMapper.INSTANCE.updateRequestToEmployee(request);
        return EmployeeMapper.INSTANCE.employeeToUpdateResponse(employeeRepository.save(employee));
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    public List<GetEmployeeResponse> getAll() {
        return EmployeeMapper.INSTANCE.employeeToGetAllResponse(employeeRepository.findAll());
    }

    public GetEmployeeResponse getById(int id) {
        return EmployeeMapper.INSTANCE.employeeToGetResponse(employeeRepository.findById(id).orElse(null));
    }
}
