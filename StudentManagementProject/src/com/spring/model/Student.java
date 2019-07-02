package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Student")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=5)
	private int id;
	
	@Column(length=10)
	@Size(min=3,max=10,message="the name should not be empty and min must be 3 and max bust be 10")
	@Pattern(regexp = "^[a-zA-Z]+$", message = " Name must contain only alphabets")
	private String name;
	
	@Column(length=20)
	@NotEmpty(message="the address must not be empty")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = " Address must contain only alphabets")
	private String address;
	
	@Column(length=10)
	
	
	//@Min(message="Minimum must be 7",value=7)
	//@Max(message="Maximum must be 10",value=10)
	@NotEmpty (message="Please Enter Student mobile no")
	@Pattern(regexp = "^[0-9]{10}+$", message = "mobile number must be 10 digits from 0-9")
	private String phone;
	
	@Column(length=8)
	@NotEmpty(message="the course must not be empty")
	private String course;
	
	public Student() {
		super();
	}
	public Student(int id, String name, String address, String phone, String course) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
