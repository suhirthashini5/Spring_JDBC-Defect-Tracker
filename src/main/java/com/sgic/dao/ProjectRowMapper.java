package com.sgic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sgic.model.Project;

public class ProjectRowMapper implements RowMapper<Project>{

	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		Project project =new Project();
		project.setProjectName(rs.getString(2));
		project.setProjectDescription(rs.getString(3));
		return project;
	}

}
