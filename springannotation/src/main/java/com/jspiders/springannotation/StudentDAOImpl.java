package com.jspiders.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public int create(Student student) {
		String sql=" insert into student "
				+" value(?,?) ";
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
