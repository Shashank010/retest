package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.spring.exception.StudentException;
import com.spring.model.Student;
@Repository
public class StuDAOImpl implements StuDAO
{
	@PersistenceContext
	EntityManager manager;

	@Override
	public int addStudent(Student s) 
	{
		manager.persist(s);
		return s.getId();
	}

	@Override
	public List<Student> getAll() 
	{
		Query query = manager.createQuery("select stu from Student stu");
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public Student getById(int id) 
	{
		Student stu = manager.find(Student.class, id);
		return stu;
	}

	@Override
	public void updateStu(Student stu,Student stus) 
	{
		Student student = manager.find(Student.class, stus.getId());
		student.setName(stu.getName());
		student.setAddress(stu.getAddress());
		student.setPhone(stu.getPhone());
		student.setCourse(stu.getCourse());
	}

	@Override
	public void delStu(int id) throws StudentException 
	{
		Student stu = manager.find(Student.class, id);
		if(stu !=null)
		{
			 manager.remove(stu);
			 
		}
		else
		{
			throw new StudentException("Id not found!");
		}
		
	}

}
