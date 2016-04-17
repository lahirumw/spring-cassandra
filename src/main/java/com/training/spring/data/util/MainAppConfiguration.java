package com.training.spring.data.util;

/**
 * bean configuration.
 * 
 * @author LahiruA
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.training.spring.data.repo.EmployeeDao;
import com.training.spring.data.repo.EmployeeDaoImpl;

@Configuration
@Import(CassandraUtil.class)
public class MainAppConfiguration {

	@Bean
	public EmployeeDao getEmployeeDAO() {
		return new EmployeeDaoImpl();
	}

	/**
	 * Creating the MyCassandraTemplate bean.
	 * 
	 * @return {@link CustomCassandraTemplate}
	 */
	@Bean
	public CustomCassandraTemplate getMyCassandraTemplate() {
		return new CustomCassandraTemplate();
	}
}
