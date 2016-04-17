package com.training.spring.data.util;

/*
 * Author : LahiruA
 * Handle CRUD operations
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;

public class CustomCassandraTemplate {

	@Autowired
	private CassandraOperations cassandraTemplate;

	public <T> T findById(Object id, Class<T> claz) {
		return cassandraTemplate.selectOneById(claz, id);
	}

	public <T> List<T> findAll(Class<T> claz) {
		return (List<T>) cassandraTemplate.selectAll(claz);
	}

	public void create(Object entity) {
		cassandraTemplate.insert(entity);
	}

	public void update(Object entity) {
		cassandraTemplate.update(entity);
	}

	public <T> void updateList(List<T> entities) {
		cassandraTemplate.update(entities);
	}

	public <T> long getCount(Class<T> claz) {
		return cassandraTemplate.count(claz);
	}

	public <T> void deleteById(Class<T> claz, Object id) {
		cassandraTemplate.deleteById(claz, id);
	}

}
