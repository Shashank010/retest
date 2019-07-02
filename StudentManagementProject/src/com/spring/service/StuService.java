package com.spring.service;

import java.util.List;

import com.spring.exception.StudentException;
import com.spring.model.Student;

public interface StuService
{
	public int addStudent(Student s);
	public List<Student> getAll();
	public Student getById(int id);
	public void updateStu(Student stu,Student stus);
	public void delStu(int id)throws StudentException;

}
