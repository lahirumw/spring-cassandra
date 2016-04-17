package com.training.spring.data.repo;

/*
 * Author : LahiruA
 * Implementaion of employee operations
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.spring.data.domain.Employee;
import com.training.spring.data.util.CustomCassandraTemplate;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private CustomCassandraTemplate cassandraTemplate;

	//find using id in employee table
	public Employee findById(Object id) {
		return cassandraTemplate.findById(id, Employee.class);
	}
	
	//get all records in employee table
	public List<Employee> findAllEmployee(){
		return cassandraTemplate.findAll(Employee.class);
	}

	//create employee record
	public void createEmployee(Object entity) {
		cassandraTemplate.create(entity);
		
	}

	//update employee record
	public void updateEmployee(Object entity) {
		cassandraTemplate.update(entity);
		
	}

	//count of employee records
	public long employeeCount() {
		return cassandraTemplate.getCount(Employee.class);
	}
	
	//remove record from employee table using id
	public void removeEmployeeById(Object id){
		cassandraTemplate.deleteById(Employee.class, id);
	}
	
	//update record list of employee
	public void updateEmployeeList(List<Object> entities){
		cassandraTemplate.updateList(entities);
	}
	
}
