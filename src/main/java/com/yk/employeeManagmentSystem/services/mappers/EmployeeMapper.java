package com.yk.employeeManagmentSystem.services.mappers;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.UpdateEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.GetEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.UpdateEmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "departmentId", target = "department.id")
    Employee addRequestToEmployee(AddEmployeeRequest request);

    AddEmployeeResponse employeeToAddResponse(Employee employee);

    @Mapping(source = "departmentId", target = "department.id")
    Employee updateRequestToEmployee(UpdateEmployeeRequest request);

    UpdateEmployeeResponse employeeToUpdateResponse(Employee employee);

    List<GetEmployeeResponse> employeeToGetAllResponse(List<Employee> employee);
    GetEmployeeResponse employeeToGetResponse(Employee employee);

}
