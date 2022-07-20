package com.arikaran.service;

import java.util.List;

import com.arikaran.model.Employee;

public interface EmployeeService {
    
	public Employee SaveEmployee(Employee employee);
	public List<Employee>getEmployee();
	public Employee getSingleEmployee(int id);
	public void deleteByid(int id );
	public Employee updateEmployee(Employee employee);
}
