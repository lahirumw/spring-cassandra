package com.training.spring.data.domain;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Employee entity class.
 * 
 * @author LahiruA
 * 
 */
@Table("employee")
public class Employee {

	@PrimaryKey("id")
	private int id;

	@Column("name")
	private String name;

	@Column(value = "salary")
	private int salary;

	/**
	 * Default Constructor
	 */
	public Employee() {
		super();
	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param salary
	 */
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            set id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            set salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name 
				+ ", salary=" + salary + "]";
	}
}