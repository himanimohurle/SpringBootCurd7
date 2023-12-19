package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hm.ServiceInterface.EmployeeServiceI;
import com.hm.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI esi;
	@PostMapping("/save")
	public Employee SaveEmployee(@RequestBody Employee emp)
	{
		System.out.println("In Controller");
		return esi.saveEmployee(emp);
	}
	
	

}
