package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Student;
import com.example.Services.StudentManager;
import com.example.Services.StudentManagerImpl;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {
	@Autowired
	private StudentManagerImpl manager;
	
	@GetMapping("api/students")
	public List<Student> getStudents()
	{
		return manager.getStudents();
	}
	@PostMapping("api/students")
	public void addStudent(Student s)
	{
		manager.addStudent(s);
	}
	@GetMapping(value= "api/studentId/{studentid}")
	public Optional<Student> getStudent(@PathVariable int studentid)
	{
		Optional<Student> s=manager.getStudents(studentid);
		return s;
	}
	@DeleteMapping("api/studentId/{studentid}")
	public void removepro (@PathVariable int studentid)
	{
		manager.delete(studentid);
	}
	@PutMapping("api/studentId/{studentid}")
	public void update( @RequestBody Student s,@PathVariable int student_id)
	{
		manager.getUpdateStudent(s,student_id);
	}

	

}
