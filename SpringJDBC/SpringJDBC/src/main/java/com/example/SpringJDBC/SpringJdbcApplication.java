package com.example.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);

	Student student =  context.getBean(Student.class);
	StudentService studentService = context.getBean(StudentService.class);

	student.setStid(6);
	student.setName("hulk");
	student.setAge(23);

	studentService.save(student);

	List<Student> list =  studentService.getAll();
		System.out.println(list);
	}

}
