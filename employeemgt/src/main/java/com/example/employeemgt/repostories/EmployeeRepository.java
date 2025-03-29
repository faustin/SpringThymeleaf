package com.example.employeemgt.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemgt.model.Employee;
 

 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}
