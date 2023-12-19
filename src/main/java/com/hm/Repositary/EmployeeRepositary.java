package com.hm.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hm.model.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer > {

}
