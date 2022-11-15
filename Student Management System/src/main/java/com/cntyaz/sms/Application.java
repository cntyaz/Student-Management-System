package com.cntyaz.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cntyaz.sms.entity.Student;
import com.cntyaz.sms.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Jon", "Doe", "doery@gmail.com");
		studentRepository.save(student1);
	
		Student student2 = new Student("Marry", "Poppins", "popping@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Sir", "Lancelot", "lancelot@gmail.com");
		studentRepository.save(student3);*/
	}

}
