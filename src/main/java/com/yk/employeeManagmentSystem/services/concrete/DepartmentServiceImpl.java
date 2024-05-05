package com.yk.employeeManagmentSystem.services.concrete;

import com.yk.employeeManagmentSystem.core.utils.exceptions.types.BusinessException;
import com.yk.employeeManagmentSystem.entities.Department;
import com.yk.employeeManagmentSystem.repositories.DepartmentRepository;
import com.yk.employeeManagmentSystem.services.abstracts.DepartmentService;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.AddDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.requests.department.UpdateDepartmentRequest;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.AddDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.GetDepartmentResponse;
import com.yk.employeeManagmentSystem.services.dtos.responses.department.UpdateDepartmentResponse;
import com.yk.employeeManagmentSystem.services.mappers.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public AddDepartmentResponse add(AddDepartmentRequest request) {
        departmentWithSameNameShouldNotExist(request.getDepartmentName());

        Department department = DepartmentMapper.INSTANCE.addRequestToDepartment(request);
        return DepartmentMapper.INSTANCE.departmentToAddResponse(departmentRepository.save(department));
    }

    public UpdateDepartmentResponse update(UpdateDepartmentRequest request) {
        departmentWithSameNameShouldNotExist(request.getDepartmentName());
        Department department = DepartmentMapper.INSTANCE.updateRequestToDepartment(request);
        return DepartmentMapper.INSTANCE.departmentToUpdateResponse(departmentRepository.save(department));
    }

    public void delete(int id) {
        departmentRepository.deleteById(id);
    }

    public List<GetDepartmentResponse> getAll() {
        return DepartmentMapper.INSTANCE.departmentsToGetAllResponse(departmentRepository.findAll());
    }

    public GetDepartmentResponse getById(int id) {
        return DepartmentMapper.INSTANCE.departmentToGetResponse(departmentRepository.findById(id).orElse(null));
    }

    private void departmentWithSameNameShouldNotExist(String name) {
        Optional<Department> departmentWithSameName = departmentRepository.findByDepartmentNameIgnoreCase(name);
        if (departmentWithSameName.isPresent()) {
            throw new BusinessException("Can't generate 2.Department with same name");
        }
    }
}
