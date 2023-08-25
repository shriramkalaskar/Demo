package com.example.Services;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentManagerImpl implements StudentManager 
{
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getStudents() {
		
		return repository.findAll();
	}
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		repository.save(s);
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Optional<Student> getStudents(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
	
	@Override
	public void getUpdateStudent( Student student,int id) {	
		repository.update( student.getStudentName(), student.getStudent_address(),student.getStudent_gender(),(Date) student.getStudent_dob(), student.getPhoto_url(),student.getStudnet_qualification(),student.getStudent_mobile(), student.getStudent_passsword(),student.getStudent_username(),student.getStudentId());
	}
	
	

}