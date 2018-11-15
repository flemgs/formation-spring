package fr.orsys.rest;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplateObject;
	

	public void setDataSource(DataSource ds) {
		this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	public void create(String name, int age) {
		// TODO Auto-generated method stub
		String SQL = "insert into student (name, age) values (?, ?)";
		this.jdbcTemplateObject.update(SQL, name, age);
		System.out.println("created record name=" + name +" age=" + age);
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("get student " + id);
		String SQL = "select * from student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new StudentMapper(), id);
		System.out.println(student.toString());
		return student;
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		System.out.println("get all students");
		String SQL = "select * from student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		for(Student student : students) {
			System.out.println(student.toString());
		}
		return students;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("delete student " + id);
		String SQL = "delete from student where id = ?";
		jdbcTemplateObject.update(SQL, id);

	}

	public void update(int id, int age) {
		// TODO Auto-generated method stub
		System.out.println("update student " + id);
		String SQL = "update student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
	}

}
