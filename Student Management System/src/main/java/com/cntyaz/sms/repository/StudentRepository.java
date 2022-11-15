package com.cntyaz.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cntyaz.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
