package com.example.springbootresthibernate.service;

import com.example.springbootresthibernate.dao.EmployeeDAO;
import com.example.springbootresthibernate.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO dao;


    public EmployeeServiceImpl(EmployeeDAO dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Transactional
    @Override
    public Employee findById(int id) {
        return dao.findById(id);
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
