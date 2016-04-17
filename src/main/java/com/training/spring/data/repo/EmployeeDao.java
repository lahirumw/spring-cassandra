package com.training.spring.data.repo;

/*
 * Author : LahiruA
 * Interface for employee operations
 * 
 */

import java.util.List;

import com.training.spring.data.domain.Employee;

public interface EmployeeDao {
	
	public Employee findById(Object id);
	
	public List<Employee> findAllEmployee();
	
	public void createEmployee(Object entity);
	
	public void updateEmployee(Object entity);
	
	public void updateEmployeeList(List<Object> entities);
	
	public long employeeCount();
	
	public void removeEmployeeById(Object id);

}
