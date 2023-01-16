package com.example.springbootresthibernate.rest;

import com.example.springbootresthibernate.dao.EmployeeDAO;
import com.example.springbootresthibernate.entity.Employee;
import com.example.springbootresthibernate.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = service.findById(id);
        if(employee==null) throw new RuntimeException("Employee not found");
        return employee;
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        service.saveEmployee(employee);
    }

    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee){
        service.saveEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable int id){
        if(service.findById(id)==null) throw new RuntimeException("Employee wasn't found");
        service.deleteById(id);
    }
}
