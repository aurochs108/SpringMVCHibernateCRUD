package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.Student;
 
public interface StudentDAO {
	
	public void saveStudentObj(Student studentObj);
	 
	public List<Student> getAllStudents();
	 
	public Student getStudentObj(int theId);
	 
	public void removeStudentObj(int theId);
}
