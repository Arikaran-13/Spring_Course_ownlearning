package com.arikaran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arikaran.model.Employee;
import com.arikaran.service.EmployeeService;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
@RequestMapping("api/ak")
public class EmployeeServletController {
	@Autowired
	EmployeeService empService;
	
	

	@GetMapping("/employees")
	public String getDetails() {
		
		return "Employee details fetching";
	}
	@GetMapping("/employeelist")
	public List<Employee> getEmployee(){
		return empService.getEmployee();
	}
	{
		
	}
	
	
	  @GetMapping("/employee/{id}")
	  public Employee getEmployee(@PathVariable("id")int id) {
		 return  empService.getSingleEmployee(id);
	  }
	 
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable("id")int id) {
		empService.deleteByid(id);
	}
	@GetMapping("/employee")
	public String getEmployeeInfo(String name) {
		return name;
	}
	@PostMapping("/postemp")
	public String postEmp(@RequestBody Employee e) {
		
		return "employee detailed posted"+e;
		
		
	}
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee e) {
		return empService.SaveEmployee(e);
		
	}
	@PostMapping("/emp")
	public String postEmployee(@RequestBody Employee e) {
		return "Employee details : "+e;
	}
	@PutMapping("/updateemp")
	public Employee updateemp(@RequestBody Employee e) {
		return empService.updateEmployee(e);
	}
}
