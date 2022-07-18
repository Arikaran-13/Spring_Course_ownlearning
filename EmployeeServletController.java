package com.arikaran.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arikaran.model.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class EmployeeServletController {
	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	@JsonProperty("App_Version")
	private String version;

	@GetMapping("/employees")
	public String getDetails() {
		
		return "Employee details fetching";
	}
	@GetMapping("/appinfo")
	public String getAppDetails() {
		return appName+" "+version;
	}
	
	  @GetMapping("/employees/{id}") public String
	  getEmployee(@PathVariable("id")int id) { return
	 "Fetching employee with id : "+id; }
	 
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id")int id) {
		return "deleted the employee with id: "+id;
	}
	@GetMapping("/employee")
	public String getEmployeeInfo(String name) {
		return name;
	}
	@PostMapping("/postemp")
	public String postEmp(@RequestBody Employee e) {
		
		return "employee detailed posted"+e;
		
		
	}
	@PostMapping("/emp")
	public String postEmployee(@RequestBody Employee e) {
		return "Employee details : "+e;
	}
	@PutMapping("employee/{id}")
	public Employee putEmployee(@PathVariable("id")int id,@RequestBody Employee e) {
		System.out.println("Employee updated");
		return e;
	}
}
