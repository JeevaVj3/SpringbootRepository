package com.onesoft.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.onesoft.employee.dao.EmployeeDao;
import com.onesoft.employee.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;

	public String setData(Employee e) {
		return ed.setData(e);
	}

	public List<Employee> setList(List<Employee> d) {
		return ed.setList(d);
	}
	
	public String upList(List<Employee> d) {
		return ed.upList(d);
	}
	
	public Employee getId(int a) {
		return ed.getId(a);
	}
	
	public List<Employee> getList() {
		return ed.getList();
	}

	public String del(int a) {
		return ed.del(a);
	}

	public List<Employee> getRoll(String a) {
		List<Employee> e = ed.getAll();
		List<Employee> h = e.stream().filter(x-> x.getRoll().equals(a)).collect(Collectors.toList());
		return h;
	}

	public List<Employee> getName(String a) {
		List<Employee> e = ed.getAll();
		List<Employee> h = e.stream().filter(x->x.getName().equals(a)).collect(Collectors.toList());
		return h;
	}
	
	public Employee getMax() {
		List<Employee> e = ed.getAll();
		Employee h = e.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		return h;
	}
	
	public List<Employee> sort(){
		List<Employee> e = ed.getAll();
		List<Employee> h = e.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		return h;
	}
	
	public List<Employee> exp(int a){
		List<Employee> e = ed.getAll();
		List<Employee> h = e.stream().filter(x-> x.getExperience()>=a).collect(Collectors.toList());
		return h;
	}
	
	public List<Employee> getGender(String a ,int b){
		List<Employee> e = ed.getAll();
		List<Employee> h = e.stream().filter(x->x.getGender().equals(a) || x.getAge()>b).collect(Collectors.toList());
		return h;
	}

	public int count() {
		List<Employee> b = ed.getAll();
		long c = b.stream().map(x-> x.getName()).count();
		return (int)c;
	}

	public List<Employee> setIncrement() {
		List<Employee> c = ed.getAll();
		List<Employee> d = c.stream().map(x-> {
			
			if(x.getGender().equalsIgnoreCase("male")) {
				x.setSalary(x.getSalary()+x.getSalary()*10/100);
			}
			else {
				x.setSalary(x.getSalary()+x.getSalary()*15/100);
			}
			return x;
			
		}).toList();
		return d;
		
	}


}
