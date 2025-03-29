package com.example.employeemgt.services;

import java.util.List;

import com.example.employeemgt.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}