package com.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
