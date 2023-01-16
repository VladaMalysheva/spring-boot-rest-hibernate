package com.example.springbootresthibernate.rest;

import com.example.springbootresthibernate.dao.EmployeeDAO;
import com.example.springbootresthibernate.entity.Employee;
import com.example.springbootresthibernate.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeService service;

    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return service.findAll();
    }
}
