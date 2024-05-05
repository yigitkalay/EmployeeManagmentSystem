package com.yk.employeeManagmentSystem.services.mappers;

import com.yk.employeeManagmentSystem.entities.Department;
import com.yk.employeeManagmentSystem.entities.Employee;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.AddDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.UpdateDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.AddDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.GetDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.UpdateDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.GetEmployeeResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.employee.UpdateEmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper INSTANCE= Mappers.getMapper(DepartmentMapper.class);

    Department addRequestToDepartment(AddDepartmentRequest request);
    AddDepartmentResponse departmentToAddResponse(Department department);

    Department updateRequestToDepartment(UpdateDepartmentRequest request);
    UpdateDepartmentResponse departmentToUpdateResponse(Department department);

    List<GetDepartmentResponse> departmentsToGetAllResponse(List<Department> departments);
    GetDepartmentResponse departmentToGetResponse(Department department);
}
