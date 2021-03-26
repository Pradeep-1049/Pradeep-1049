package com.jspiders.springmysql;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOimpl implements StudentDAO {
	
     private JdbcTemplate jdbcTemplate;
     
	@Override
	public int create(Student student) {
		String sql=" insert int student "+ " value(?,?) ";
		int res=jdbcTemplate.update(sql,student.getId(),student.getName());
		return res;
	}

	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
   
}
