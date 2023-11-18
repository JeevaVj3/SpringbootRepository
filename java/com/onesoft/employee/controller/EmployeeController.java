package com.onesoft.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.onesoft.employee.entity.Employee;
import com.onesoft.employee.service.EmployeeService;

@RestController
@RequestMapping("/admin")
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@PostMapping("/setdata")
	public String setData(@RequestBody Employee e) {
		return es.setData(e);
	}

	@PostMapping("/setList")
	public List<Employee> setList(@RequestBody List<Employee> d) {
		return es.setList(d);
	}

	@PutMapping("/updateList")
	public String upList(@RequestBody List<Employee> d) {
		return es.upList(d);
	}

	@GetMapping("/getId/{a}")
	public Employee getId(@PathVariable int a) {
		return es.getId(a);
	}

	@GetMapping("/getList")
	public List<Employee> getList() {
		return es.getList();
	}

	@DeleteMapping("/deleteId/{a}")
	public String del(@PathVariable int a) {
		return es.del(a);
	}
	
	@GetMapping("/getRoll/{a}")
	public List<Employee> getRoll(@PathVariable String a){
		return es.getRoll(a);
	}
	
	@GetMapping("/getName/{a}")
	public List<Employee> getName(@PathVariable String a) {
		return es.getName(a);
	}
	
	@GetMapping("/getMax")
	public Employee getMax(){
		return es.getMax();
	}
	
	@GetMapping("/sortAge")
	public List<Employee> sort(){
		return es.sort();
	}
	
	@GetMapping("/getExp/{a}")
	public List<Employee> exp(@PathVariable int a){
		return es.exp(a);
	}
	
	@GetMapping("/getGender/{a}/{b}")
	public List<Employee> getGender(@PathVariable String a, @PathVariable int b) {
		return es.getGender(a, b);
	}
	
	@GetMapping("/count")
	public int count() {
		return es.count();
	}
	
	@GetMapping("/increment")
	public List<Employee> setIncrement(){
		return es.setIncrement();
	}
}
