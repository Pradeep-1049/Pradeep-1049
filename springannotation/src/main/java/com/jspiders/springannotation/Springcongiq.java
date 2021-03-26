package com.jspiders.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Springcongiq {
  @Bean
  public  DriverManagerDataSource setDataSource()
  {   
	  
	  DriverManagerDataSource datasource=new DriverManagerDataSource();
	  datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  datasource.setUrl("jdbc:mysql://localhost/besm28");
	  datasource.setUsername("root");
	  datasource.setPassword("root");
	  return datasource;  
  }
  @Bean
  public JdbcTemplate getJdbcTemplate()
  {
	  JdbcTemplate jdbcTemplate=new JdbcTemplate();
	  jdbcTemplate.setDataSource(jdbcTemplate.getDataSource());
	  
	  //DriverManagerDataSource datasource=getDataSource();
	  //jdbcTemplate.setDataSource(datasource);
	  return jdbcTemplate;
  }
  public StudentDAOImpl getStudentDAOImpl()
  {
	  StudentDAOImpl studentDAOImpl  =new StudentDAOImpl();
	  studentDAOImpl.setJdbcTemplate(getJdbcTemplate());
	  return studentDAOImpl;
  }
  public Student student()
  {
	  Student student =new Student();
	  return student;
  }
  
}
