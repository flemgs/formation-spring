package fr.orsys.rest;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource ds);
	
	public void create(String name, int age);
	
	public Student getStudent(int id);
	
	public List<Student> listStudents();
	
	public void delete(int id);
	
	public void update(int id, int age);
}
