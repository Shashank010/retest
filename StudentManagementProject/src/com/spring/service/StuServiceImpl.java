package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StuDAO;
import com.spring.exception.StudentException;
import com.spring.model.Student;
@Service
@Transactional
public class StuServiceImpl implements StuService
{
	@Autowired
	StuDAO studao;

	@Override
	public int addStudent(Student s)
	{
		studao.addStudent(s);
		return s.getId();
	}

	@Override
	public List<Student> getAll()
	{
		return studao.getAll();
	}

	@Override
	public Student getById(int id) 
	{
		return studao.getById(id);
	}

	@Override
	public void updateStu(Student stu,Student stus) 
	{
		
		 studao.updateStu(stu,stus);
	}

	@Override
	public void delStu(int id) throws StudentException 
	{
		studao.delStu(id);
	}

}
