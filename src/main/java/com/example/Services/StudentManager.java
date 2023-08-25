package com.example.Services;
import java.util.List;
import java.util.Optional;

import com.example.Entities.Student;

public interface StudentManager 
{
	List<Student> getStudents();
	void addStudent(Student s);
	Optional<Student> getStudents(int id);
	void delete(int id );
	List<Student> getAll();
	void getUpdateStudent( Student student,int id);
	
}