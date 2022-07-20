package com.arikaran.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arikaran.model.Employee;
import com.arikaran.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository eRepo;
	@Override
	public Employee SaveEmployee(Employee employee) {
		
		return eRepo.save(employee);
		
	}

	
	@Override
	public List<Employee> getEmployee() {
		
		return eRepo.findAll();
	}


	@Override
	public Employee getSingleEmployee(int id) {
		Optional<Employee> e = eRepo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		throw new RuntimeException("Employee id not found in the database "+id);
	}


	@Override
	public void deleteByid(int id) {
		eRepo.deleteById(id);
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		return eRepo.save(employee);
	}




}
