package com.example.springbootresthibernate.dao;

import com.example.springbootresthibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void saveEmployee(Employee employee);

    public void deleteById(int id);
}
