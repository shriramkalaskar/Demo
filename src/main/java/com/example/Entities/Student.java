package com.example.Entities;

import java.util.*;

import java.util.Date;


//import com.example.entityPayment.Payment;
//import com.example.entityPayment.PaymentMaster;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Student {
	private int student_id;
	private String student_name;
	private String student_address;

	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Set<PaymentMaster> payment_master;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Set<Payment> payments;  */  

	@Column(name = "student_address", nullable = true, length = 100)
	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	@Column(name = "student_gender", nullable = true, length = 100)
	public String getStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}

	@Column(name = "photo_url", nullable = true, length = 100)
	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	@Column(name = "student_dob", nullable = true, length = 100)
	public Date getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}

	@Column(name = "student_qualification", nullable = true, length = 100)
	public String getStudnet_qualification() {
		return studnet_qualification;
	}

	public void setStudnet_qualification(String studnet_qualification) {
		this.studnet_qualification = studnet_qualification;
	}

	@Column(name = "student_mobile", nullable = true, length = 100)
	public int getStudent_mobile() {
		return student_mobile;
	}

	public void setStudent_mobile(int student_mobile) {
		this.student_mobile = student_mobile;
	}

	@Column(name = "student_password", nullable = true, length = 100)
	public String getStudent_passsword() {
		return student_passsword;
	}

	public void setStudent_passsword(String student_passsword) {
		this.student_passsword = student_passsword;
	}

	@Column(name = "student_username", nullable = true, length = 100)
	public String getStudent_username() {
		return student_username;
	}

	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}

	private String student_gender;
	private String photo_url;
	private Date student_dob;
	private String studnet_qualification;
	private int student_mobile;
	private String student_passsword;
	private String student_username;

	public Student() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	public int getStudentId() {
		return this.student_id;
	}

	public void setStudentId(int studentId) {
		this.student_id = studentId;
	}

	@Column(name = "student_name", nullable = true, length = 100)
	public String getStudentName() {
		return this.student_name;
	}

	public void setStudentName(String studentName) {
		this.student_name = studentName;
	}

}
