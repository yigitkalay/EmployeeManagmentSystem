package com.yk.employeeManagmentSystem.services.mappers;

import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.dtos.requests.employee.AddEmployeeRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.AddEmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "departmentId", target = "department.id")
    Employee employeeFromRequest(AddEmployeeRequest request);

    AddEmployeeResponse employeeFromResponse(Employee employee);
}
