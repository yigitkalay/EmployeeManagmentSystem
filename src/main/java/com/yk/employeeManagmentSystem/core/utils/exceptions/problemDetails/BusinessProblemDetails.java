package com.yk.employeeManagmentSystem.core.utils.exceptions.problemDetails;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails(){
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        setTitle("Business Rule Violation");
        setType(location+"/exceptions/business");
        setStatus("400");
    }
}
