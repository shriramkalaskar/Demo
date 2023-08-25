package com.example.repository;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entities.Student;

import jakarta.transaction.Transactional;
import com.example.Entities.*;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	@Modifying
	@Query("UPDATE Student s SET s.student_name = :name, s.student_address = :add, s.student_gender = :gender, s.student_dob = :date,s.getPhoto_url=: url, s.student_qualification = :qual, s.student_mobile = :mob, s.student_password = :pass, s.student_username = :uname WHERE s.student_id = :id")
	void update(@Param("name") String student_name, @Param("add") String student_address, @Param("gender") String student_gender,
	        @Param("date") Date student_dob,@Param("url") String getPhoto_url, @Param("qual") String student_qualification, @Param("mob") String student_mobile, @Param("pass") String student_password,
	        @Param("uname") String student_username, @Param("id") int student_id);
	
		
}