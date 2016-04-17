package com.training.spring.data.main;

/*
 * @Title spring-cassandra traning project
 * @author LahiruA
 * @Date 16-4-2016
 */

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.data.repo.EmployeeDao;
import com.training.spring.data.util.MainAppConfiguration;
import com.training.spring.data.domain.Employee;

public class App {

	public static void main(String[] args) {
		System.out.println("processing");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainAppConfiguration.class);
		EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);
		// insert new employee
		//employeeDao.createEmployee(new Employee(2, "Asanga", 1000));
		// select by id
		Employee employee = employeeDao.findById(1);
		System.out.println(employee.getName());
		//update employee details
		//employeeDao.updateEmployee(new Employee(1, "Lahiru", 15000));
		//select all records in employee table
		List<Employee> listEmployee = employeeDao.findAllEmployee();
		System.out.println("Employee Count " + employeeDao.employeeCount());
		for(Employee emp : listEmployee){
			System.out.println("Employee id : " + emp.getId() +"  Name : " + emp.getName() + "  Salary : " + emp.getSalary());
		}
	}

}
