package com.onesoft.employee.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.onesoft.employee.entity.Employee;
import com.onesoft.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository er;

	public String setData(Employee e) {
		er.save(e);
		return "Save Succesfully";
	}

	public List<Employee> setList(List<Employee> d) {
		er.saveAll(d);
		return d;
	}
	
	public String upList(List<Employee> d) {
		er.saveAll(d);
		return "Update Sucess";
	}
	
	public Employee getId(int a) {
		return er.findById(a).get();
	}
	
	public List<Employee> getList() {
		return er.findAll();
	}

	public String del(int a) {
		er.deleteById(a);
		return "Deleted";
	}
	
	public List<Employee> getAll() {
		return er.findAll();
	}

}
