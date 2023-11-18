package com.onesoft.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{




}
