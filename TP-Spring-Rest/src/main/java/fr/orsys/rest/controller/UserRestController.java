package fr.orsys.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.orsys.rest.Student;
import fr.orsys.rest.StudentJDBCTemplate;

@RestController
public class UserRestController {

	@Autowired
	private StudentJDBCTemplate studentJDBCTemplate;
	
	@RequestMapping(value="/user/", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> listAllUsers() {
		System.out.println("STUDENT CONTROLLER");
		List<Student> students = studentJDBCTemplate.listStudents();
		if(students.isEmpty()) {
			return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		}
		System.out.println("STUDENT NOT EMPTY");
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getUser(@PathVariable("id") int id) {
		System.out.println("Fetching user with id " + id);
		Student student = studentJDBCTemplate.getStudent(id);
		if(student== null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
