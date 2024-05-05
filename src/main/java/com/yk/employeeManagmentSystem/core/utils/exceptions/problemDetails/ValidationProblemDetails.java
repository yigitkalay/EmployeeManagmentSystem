package com.yk.employeeManagmentSystem.core.utils.exceptions.problemDetails;

import lombok.Data;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@Data
public class ValidationProblemDetails extends ProblemDetails{

    public ValidationProblemDetails(){
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        setTitle("Validation Rule Violation");
        setDetail("Validation Problem");
        setType(location+"/exceptions/validation");
        setStatus("400");
    }

    private Map<String,String> errors;
}
