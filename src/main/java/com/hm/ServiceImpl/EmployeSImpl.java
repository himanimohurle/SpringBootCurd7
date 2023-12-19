package com.hm.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.Repositary.EmployeeRepositary;
import com.hm.ServiceInterface.EmployeeServiceI;
import com.hm.model.Employee;
@Service
public class EmployeSImpl implements EmployeeServiceI {

	@Autowired
	EmployeeRepositary eri;
	@Override
	public Employee saveEmployee(Employee emp) {
		
		return eri.save(emp);
	}

}
