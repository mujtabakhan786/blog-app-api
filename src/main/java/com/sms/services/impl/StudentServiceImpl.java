package com.sms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entities.Student;
import com.sms.repositories.StudentRepo;
import com.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		
		return this.studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student deleteStudent(Long id) {
		studentRepo.deleteById(id);
		return null;
	}

}
