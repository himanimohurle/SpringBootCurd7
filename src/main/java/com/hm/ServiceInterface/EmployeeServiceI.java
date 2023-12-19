package com.hm.ServiceInterface;

import org.springframework.stereotype.Service;

import com.hm.model.Employee;

@Service
public interface EmployeeServiceI {

	Employee saveEmployee(Employee emp);

}
