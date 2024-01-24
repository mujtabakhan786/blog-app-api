package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entities.Student;
import com.sms.repositories.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
//	@Autowired
//	private StudentRepo studentRepo;

	public void run(String... args) throws Exception {
//		Student student1=new Student();
//		student1.setFirstName("Tf");
//		student1.setLastName("ds");
//		student1.setEmail("scs@wr");
//		studentRepo.save(student1);
//		
//		Student student2=new Student();
//		student2.setFirstName("Tf");
//		student2.setLastName("ds");
//		student2.setEmail("scs@wr");
//		studentRepo.save(student2);
	}

}
