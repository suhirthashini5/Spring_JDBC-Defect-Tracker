package com.sgic.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sgic.model.Project;



public class ProjectDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
	
}
