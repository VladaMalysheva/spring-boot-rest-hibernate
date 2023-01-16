package com.example.springbootresthibernate.rest;

import com.example.springbootresthibernate.dao.EmployeeDAO;
import com.example.springbootresthibernate.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO dao;

    public EmployeeRestController(EmployeeDAO dao) {
        this.dao = dao;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return dao.findAll();
    }
}
