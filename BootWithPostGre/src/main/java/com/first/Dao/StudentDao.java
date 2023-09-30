package com.first.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate template;
	
	// create the table
	public void createTable()
	{
		var qr = "CREATE TABLE student(id SERIAL PRIMARY KEY,name varchar(100) NOT NULL,city VARCHAR(100))";
		int i = this.template.update(qr);
		System.out.println(i);
	}
	
	// inserting data
	public void insertDatat(String name,String city)
	{
		var qr = "insert into student(name,city) values(?,?)";
		int i = this.template.update(qr,name,city);
		System.out.println(i+" record added");
		
	}
}
